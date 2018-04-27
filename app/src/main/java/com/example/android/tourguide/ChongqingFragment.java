package com.example.android.tourguide;

import java.util.ArrayList;

public class ChongqingFragment extends MyFragment {
    public ChongqingFragment() {
        // Required empty public constructor
    }

    @Override
    protected ArrayList<Attraction> getAttsInfo(){
        String[] names = {
                getContext().getString(R.string.chongqing_name_ciqikou),
                getContext().getString(R.string.chongqing_name_jiefangbei),
                getContext().getString(R.string.chongqing_name_hongyadong),
                getContext().getString(R.string.chongqing_name_baigongguan),
                getContext().getString(R.string.chongqing_name_zhazhidong),
                getContext().getString(R.string.chongqing_name_tianshengsanqiao),
                getContext().getString(R.string.chongqing_name_dazushike),
                getContext().getString(R.string.chongqing_name_luohansi),
                getContext().getString(R.string.chongqing_name_bowuguan)
        };
        String[] details = {
                getContext().getString(R.string.chongqing_detail_ciqikou),
                getContext().getString(R.string.chongqing_detail_jiefangbei),
                getContext().getString(R.string.chongqing_detail_hongyadong),
                getContext().getString(R.string.chongqing_detail_baigongguan),
                getContext().getString(R.string.chongqing_detail_zhazhidong),
                getContext().getString(R.string.chongqing_detail_tianshengsanqiao),
                getContext().getString(R.string.chongqing_detail_dazushike),
                getContext().getString(R.string.chongqing_detail_luohansi),
                getContext().getString(R.string.chongqing_detail_bowuguan)
        };
        String[] addresses = {
            getContext().getString(R.string.chongqing_address_ciqikou),
            getContext().getString(R.string.chongqing_address_jiefangbei),
            getContext().getString(R.string.chongqing_address_hongyadong),
            getContext().getString(R.string.chongqing_address_baigongguan),
            getContext().getString(R.string.chongqing_address_zhazhidong),
            getContext().getString(R.string.chongqing_address_tianshengsanqiao),
            getContext().getString(R.string.chongqing_address_dazushike),
            getContext().getString(R.string.chongqing_address_luohansi),
            getContext().getString(R.string.chongqing_address_bowuguan)
        };
        int[] resourceIds = {
            R.drawable.chongqing_ciqikou,
            R.drawable.chongqing_jiefangbei,
            R.drawable.chongqing_hongyadong,
            R.drawable.chongqing_baigongguan,
            R.drawable.chongqing_zhazidong,
            R.drawable.chongqing_tianshengsanqiao,
            R.drawable.chongqing_dazushike,
            R.drawable.chongqing_luohansi,
            R.drawable.chongqing_sanxiabowuguan

        };
        ArrayList<Attraction> atts = new ArrayList<>();
        for(int i = 0; i < names.length; i ++){
            Attraction att = new Attraction(names[i], addresses[i], details[i], resourceIds[i]);
            atts.add(att);
        }

        return atts;
    }
}
