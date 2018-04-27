package com.example.android.tourguide;



import java.util.ArrayList;


public class BeijingFragment extends MyFragment {


    public BeijingFragment() {
        // Required empty public constructor
    }

    @Override
    protected ArrayList<Attraction> getAttsInfo(){
        String[] names = {
                getContext().getString(R.string.beijing_name_gugong),
                getContext().getString(R.string.beijing_name_badaling),
                getContext().getString(R.string.beijing_name_yiheyuan),
                getContext().getString(R.string.beijing_name_gongwangfu),
                getContext().getString(R.string.beijing_name_yuanmingyuan),
                getContext().getString(R.string.beijing_name_shuilifang),
                getContext().getString(R.string.beijing_name_dongwuyuan),
                getContext().getString(R.string.beijing_name_fuguo),
                getContext().getString(R.string.beijing_name_guanfu),
                getContext().getString(R.string.beijing_name_guozijian)
        };
        String[] details = {
                getContext().getString(R.string.beijing_detail_gugong),
                getContext().getString(R.string.beijing_detail_badaling),
                getContext().getString(R.string.beijing_detail_yiheyuan),
                getContext().getString(R.string.beijing_detail_gongwangfu),
                getContext().getString(R.string.beijing_detail_yuanmingyuan),
                getContext().getString(R.string.beijing_detail_shuilifang),
                getContext().getString(R.string.beijing_detail_dongwuyuan),
                getContext().getString(R.string.beijing_detail_fuguo),
                getContext().getString(R.string.beijing_detail_guanfu),
                getContext().getString(R.string.beijing_detail_guozijian)
        };
        String[] addresses = {
                getContext().getString(R.string.beijing_address_gugong),
                getContext().getString(R.string.beijing_address_badaling),
                getContext().getString(R.string.beijing_address_yiheyuan),
                getContext().getString(R.string.beijing_address_gongwangfu),
                getContext().getString(R.string.beijing_address_yuanmingyuan),
                getContext().getString(R.string.beijing_address_shuilifang),
                getContext().getString(R.string.beijing_address_dongwuyuan),
                getContext().getString(R.string.beijing_address_fuguo),
                getContext().getString(R.string.beijing_address_guanfu),
                getContext().getString(R.string.beijing_address_guozijian)
        };
        int[] resourceIds = {
                R.drawable.beijing_gugong,
                R.drawable.beijing_badaling,
                R.drawable.beijing_yiheyuan,
                R.drawable.beijing_gongwangfu,
                R.drawable.beijing_yuanmingyuan,
                R.drawable.beijing_shuilifang,
                R.drawable.beijing_dongwuyuan,
                R.drawable.beijing_fuguo,
                R.drawable.beijing_guanfu,
                R.drawable.beijing_guozijian
            };
        ArrayList<Attraction> atts = new ArrayList<>();
        for(int i = 0; i < names.length; i ++){
            Attraction att = new Attraction(names[i], addresses[i], details[i], resourceIds[i]);
            atts.add(att);
        }

        return atts;
    }
    
}
