package com.example.android.tourguide;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BeijingFragment();
        } else if (position == 1) {
            return new XianFragment();
        } else if (position == 2) {
            return new ChangshaFragment();
        } else {
            return new ChongqingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.beijing_category);
        } else if (position == 1) {
            return mContext.getString(R.string.xian_category);
        } else if (position == 2) {
            return mContext.getString(R.string.changsha_category);
        } else {
            return mContext.getString(R.string.chongqing_category);
        }
    }
}
