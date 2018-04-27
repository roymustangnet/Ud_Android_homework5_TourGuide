package com.example.android.tourguide;

import java.util.ArrayList;

public class XianFragment extends MyFragment {
    public XianFragment(){

    }

    @Override
    protected ArrayList<Attraction> getAttsInfo(){
        String[] names = {
                getContext().getString(R.string.xian_name_bingmayong),
                getContext().getString(R.string.xian_name_huaqingchi),
                getContext().getString(R.string.xian_name_famensi),
                getContext().getString(R.string.xian_name_dayanta),
                getContext().getString(R.string.xian_name_zhonglou),
                getContext().getString(R.string.xian_name_huiminjie),
                getContext().getString(R.string.xian_name_daminggong),
                getContext().getString(R.string.xian_name_xiaoyanta),
                getContext().getString(R.string.xian_name_hanyangling)
        };

        String[] details = {
                getContext().getString(R.string.xian_detail_bingmayong),
                getContext().getString(R.string.xian_detail_huaqingchi),
                getContext().getString(R.string.xian_detail_famensi),
                getContext().getString(R.string.xian_detail_dayanta),
                getContext().getString(R.string.xian_detail_zhonglou),
                getContext().getString(R.string.xian_detail_huiminjie),
                getContext().getString(R.string.xian_detail_daminggong),
                getContext().getString(R.string.xian_detail_xiaoyanta),
                getContext().getString(R.string.xian_detail_hanyangling)
        };

        String[] addresses = {
                getContext().getString(R.string.xian_address_bingmayong),
                getContext().getString(R.string.xian_address_huaqingchi),
                getContext().getString(R.string.xian_address_famensi),
                getContext().getString(R.string.xian_address_dayanta),
                getContext().getString(R.string.xian_address_zhonglou),
                getContext().getString(R.string.xian_address_huiminjie),
                getContext().getString(R.string.xian_address_daminggong),
                getContext().getString(R.string.xian_address_xiaoyanta),
                getContext().getString(R.string.xian_address_hanyangling)
        };


        int[] resourceIds = {
            R.drawable.xian_bingmayong,
            R.drawable.xian_huaqingchi,
            R.drawable.xian_famensi,
            R.drawable.xian_dayata,
            R.drawable.xianzhonglou,
            R.drawable.xian_huiminjie,
            R.drawable.xian_daminggong,
            R.drawable.xian_xiaoyanta,
            R.drawable.xian_hanyangling
        };
        ArrayList<Attraction> atts = new ArrayList<>();
        for(int i = 0; i < names.length; i ++){
            Attraction att = new Attraction(names[i], addresses[i], details[i], resourceIds[i]);
            atts.add(att);
        }

        return atts;
    }


}
