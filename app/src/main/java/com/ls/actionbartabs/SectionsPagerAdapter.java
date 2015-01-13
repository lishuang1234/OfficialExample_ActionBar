package com.ls.actionbartabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ls on 2015/1/3 0003.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private String[] titles = new String[]{"TAB1", "TAB2", "TAB3"};

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return PlaceholderFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];//return fragment's title
    }

}
