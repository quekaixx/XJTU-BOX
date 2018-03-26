package net.eeyes.app.xjtu_box.twitter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.eeyes.app.xjtu_box.R;
import net.eeyes.app.xjtu_box.net.Services;

import java.util.List;

import io.reactivex.functions.Consumer;

public class TwitterFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_twitter,container,false);
        Services.get(HTTPInterfaces.class).funName(2,3).subscribe(new Consumer<List<DateFromNet>>() {
            @Override
            public void accept(List<DateFromNet> dateFromNets) throws Exception {
                // TODO: 3/26/2018 这里处理返回的数据
                System.out.println(dateFromNets);//这里只是简单的把数据打印出来。
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                // TODO: 3/26/2018 这里处理错误
                System.out.println("网络请求错误");//这里只是简单的打印了一句网络请求错误。
            }
        });
        return root;
    }
}
