package com.example.android.tourguide;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BeijingFragment();
        } else if (position == 1) {
            return new XianFragment();
        } else if (position == 2) {
            return null;
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
