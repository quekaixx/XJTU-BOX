package net.eeyes.app.xjtu_box.net;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhaohang on 2018/3/18.
 */

public class Services {
    private static final String BASE_URL = "https://app.eeyes.net/zhao_hang/eeyeschuangyigongfang/1.0.0/";

    //用于存储已经创建的service代理
    //一个Service只实例化一次
    private static List<Object> servicesList = new ArrayList<>();

    synchronized public static <T> T get(final Class<T> clazz){
        //判断此service是否已经创建，如果已创建，返回此service
        for (Object service:servicesList){
            //service的代理对象的toString方法重写为 "instance of " + className
            if (service.toString().equals("instance of " + clazz.getName())){
                return (T) service;
            }
        }

        //新建service代理
        //首先使用Retrofit创建service代理实例nativeServiceInstance
        //在此完成Retrofit相关设置
        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request.Builder builder = chain.request().newBuilder();
                builder.addHeader("Accept","application/json");
                return chain.proceed(builder.build());
            }
        };

        final T nativeServiceInstance = new Retrofit.Builder()//创建Retrofit.Builder实例
                .baseUrl(BASE_URL)//设置baseUrl
                .client(new OkHttpClient.Builder()
                        .addInterceptor(interceptor).build())//设置OkHttpClient
                .addConverterFactory(GsonConverterFactory.create())//设置Java对象与网络数据的转换方式
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//设置使用RxJava处理结果
                .build()//创建Retrofit实例
                .create(clazz);//创建Service实例

        //创建新的代理实例，代理nativeServiceInstance
        T serviceInstance = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                //代理后的对象的getClass方法无法返回被代理的类，因此使用toString方法获得被代理的类名
                if (method.getName().equals("toString")){
                    return "instance of " + clazz.getName();
                }
                //如果是Object的方法，则invoke原方法
                for (Method objectMethod: Object.class.getMethods()){
                    if(method.equals(objectMethod)){
                        return method.invoke(nativeServiceInstance,objects);
                    }
                }
                //终于到了需要执行的两行代码了
                //在此处执行被代理Service的方法并调用设置线程的两行代码
                Object observable = method.invoke(nativeServiceInstance,objects);
                if (!(observable instanceof Observable)){
                    throw new RuntimeException("被代理的service对象返回对象不是Observable,而是：" + observable.getClass().getName());
                }
                return ((Observable)observable)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());

            }
        });

        servicesList.add(serviceInstance);
        return serviceInstance;

    }
}
