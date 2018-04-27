package com.example.android.tourguide;


import java.util.ArrayList;

public class ChangshaFragment extends MyFragment {
    public ChangshaFragment(){

    }

    @Override
    protected ArrayList<Attraction> getAttsInfo(){
        String[] names = {
                getContext().getString(R.string.changsha_name_yuelushan),
                getContext().getString(R.string.changsha_name_juzizhou),
                getContext().getString(R.string.changsha_name_huogongdian),
                getContext().getString(R.string.changsha_name_shijiezhichuang),
                getContext().getString(R.string.changsha_name_tianxinge),
                getContext().getString(R.string.changsha_name_bowuguan),
                getContext().getString(R.string.changsha_name_lieshigongyuan),
                getContext().getString(R.string.changsha_name_leifeng),
                getContext().getString(R.string.changsha_name_kaifusi),
                getContext().getString(R.string.changsha_name_huaminglou)
        };
        String[] details = {
                getContext().getString(R.string.changsha_detail_yuelushan),
                getContext().getString(R.string.changsha_detail_juzizhou),
                getContext().getString(R.string.changsha_detail_huogongdian),
                getContext().getString(R.string.changsha_detail_shijiezhichuang),
                getContext().getString(R.string.changsha_detail_tianxinge),
                getContext().getString(R.string.changsha_detail_bowuguan),
                getContext().getString(R.string.changsha_detail_lieshigongyuan),
                getContext().getString(R.string.changsha_detail_leifeng),
                getContext().getString(R.string.changsha_detail_kaifusi),
                getContext().getString(R.string.changsha_detail_huaminglou)
        };
        String[] addresses = {
                getContext().getString(R.string.changsha_address_yuelushan),
                getContext().getString(R.string.changsha_address_juzizhou),
                getContext().getString(R.string.changsha_address_huogongdian),
                getContext().getString(R.string.changsha_address_shijiezhichuang),
                getContext().getString(R.string.changsha_address_tianxinge),
                getContext().getString(R.string.changsha_address_bowuguan),
                getContext().getString(R.string.changsha_address_lieshigongyuan),
                getContext().getString(R.string.changsha_address_leifeng),
                getContext().getString(R.string.changsha_address_kaifusi),
                getContext().getString(R.string.changsha_address_huaminglou)
        };
        int[] resourceIds = {
            R.drawable.changsha_yuelushan,
            R.drawable.changsha_juzizhou,
            R.drawable.changsha_huogongdian,
            R.drawable.changsha_shijiezhichuang,
            R.drawable.changsha_tianxinge,
            R.drawable.changsha_bowuguan,
            R.drawable.changsha_lieshigongyuan,
            R.drawable.changsha_leifeng,
            R.drawable.changsha_kaifusi,
            R.drawable.changsha_huaminglou
        };
        ArrayList<Attraction> atts = new ArrayList<>();
        for(int i = 0; i < names.length; i ++){
            Attraction att = new Attraction(names[i], addresses[i], details[i], resourceIds[i]);
            atts.add(att);
        }

        return atts;
    }
}
