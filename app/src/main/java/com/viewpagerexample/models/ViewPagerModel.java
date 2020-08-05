package com.viewpagerexample.models;


import com.viewpagerexample.R;

public enum ViewPagerModel {

    ONE(R.string.one, R.layout.view_one),
    TWO(R.string.two, R.layout.view_two),
    THREE(R.string.three, R.layout.view_three),
    FOUR(R.string.four,R.layout.view_four),
    FIVE(R.string.five,R.layout.view_five);

    private int mTitleResId;
    private int mLayoutResId;

    ViewPagerModel(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
