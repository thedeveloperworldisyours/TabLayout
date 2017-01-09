package com.thedeveloperworldisyours.tabbarr;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thedeveloperworldisyours.tabbarr.adapter.TabsAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);


        viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager(), this));
        tabLayout.setupWithViewPager(viewPager);
    }
}
