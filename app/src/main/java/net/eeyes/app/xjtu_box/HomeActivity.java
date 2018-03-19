package net.eeyes.app.xjtu_box;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import net.eeyes.app.xjtu_box.deannotification.DeanNotificationFragment;
import net.eeyes.app.xjtu_box.market.MarketFragment;
import net.eeyes.app.xjtu_box.net.Services;
import net.eeyes.app.xjtu_box.studyresource.StudyResourceFragment;
import net.eeyes.app.xjtu_box.twitter.TwitterFragment;
import net.eeyes.app.xjtu_box.user.UserFragment;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.HttpException;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("twitter", TwitterFragment.class)//表白失物招领等
                .add("market", MarketFragment.class)//二手交易市场
                .add("study resource", StudyResourceFragment.class)//学习资料
                .add("notification", DeanNotificationFragment.class)//教务处通知
                .add("user", UserFragment.class)//个人中心
                .create());

        ViewPager viewPager = findViewById(R.id.home_view_pager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = findViewById(R.id.home_tab);
        viewPagerTab.setViewPager(viewPager);
    }
}
