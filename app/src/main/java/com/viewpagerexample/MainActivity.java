package com.viewpagerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.viewpagerexample.adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        //method calls
        init();
        setAdapter();
        //method calls
    }

    private void setAdapter() {
        viewPager.setAdapter(new ViewPagerAdapter(MainActivity.this));
    }

    private void init() {
        viewPager = findViewById(R.id.vp_home);
    }
}