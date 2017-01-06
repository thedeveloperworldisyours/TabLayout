package com.thedeveloperworldisyours.tabbarr.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thedeveloperworldisyours.tabbarr.R;
import com.thedeveloperworldisyours.tabbarr.fragment.FirstFragment;
import com.thedeveloperworldisyours.tabbarr.fragment.SecondFragment;
import com.thedeveloperworldisyours.tabbarr.fragment.ThirdFragment;

/**
 * Created by javierg on 06/01/2017.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    public static final int TOTAL_TABS = 3;
    public Context mContext;

    public TabsAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment().newInstance();
            case 1:
                return new SecondFragment().newInstance();
            case 2:
            default:
                return new ThirdFragment().newInstance();
        }
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.fragment_first_title);
            case 1:
                return mContext.getString(R.string.fragment_second_title);
            case 2:
            default:
                return mContext.getString(R.string.fragment_third_title);
        }
    }

}
