package net.eeyes.app.xjtu_box;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by zhaohang on 2018/3/19.
 */

public interface Service {
    @GET("article/hotArticles")
    Observable<List<Article>> getHotArticles();
}
