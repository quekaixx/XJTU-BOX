package net.eeyes.app.xjtu_box.twitter;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zhaohang on 3/26/2018.
 * 这是演示用类，正式开发时将删除。
 */

public interface HTTPInterfaces {


    @GET("article/hotArticles")
    Observable<List<DateFromNet>> funName(@Query("itemStartPos") Integer startPos, @Query("itemCount") Integer count);


}
