package com.example.android.tourguide;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private static final int PAGECOUNT = 4;
    private final int PAGE_ONE = 0;
    private final int PAGE_TWO = 0;
    private final int PAGE_THREE = 0;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == PAGE_ONE) {
            return new BeijingFragment();
        } else if (position == PAGE_TWO) {
            return new XianFragment();
        } else if (position == PAGE_THREE) {
            return new ChangshaFragment();
        } else {
            return new ChongqingFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGECOUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == PAGE_ONE) {
            return mContext.getString(R.string.beijing_category);
        } else if (position == PAGE_TWO) {
            return mContext.getString(R.string.xian_category);
        } else if (position == PAGE_THREE) {
            return mContext.getString(R.string.changsha_category);
        } else {
            return mContext.getString(R.string.chongqing_category);
        }
    }
}
