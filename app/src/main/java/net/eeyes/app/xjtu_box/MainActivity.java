package net.eeyes.app.xjtu_box;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.eeyes.app.xjtu_box.net.Services;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.HttpException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Services.get(Service.class).
                getHotArticles()
                .subscribe(System.out::println,Throwable::printStackTrace);
    }
}
