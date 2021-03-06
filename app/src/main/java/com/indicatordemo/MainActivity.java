package com.indicatordemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp;
    private VPAdapter vpAdapter;
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.vp);
        vpAdapter = new VPAdapter(this);
        vp.setAdapter(vpAdapter);

        Log.e("111", "测试---------------");
        Log.e("111", "测试-----------333----");
        Log.e("111", "测试-----------444444444444----");
        ll = (LinearLayout) findViewById(R.id.ll);
        vp.setOnPageChangeListener(new ViewPagerIndicator(this, vp, ll, 3));
    }
}
