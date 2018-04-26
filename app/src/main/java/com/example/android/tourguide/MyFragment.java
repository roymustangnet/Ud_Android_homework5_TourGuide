package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public abstract class MyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.list_attractions, container, false);

        final ArrayList<Attraction> atts = getAttsInfo();

        ListView lv = (ListView) rootView.findViewById(R.id.list_view);
        lv.setAdapter(new AttractionAdapter(getActivity(), atts));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction att = atts.get(position);
                Intent intent = new Intent(MyFragment.this.getActivity(), AttractionDetailActivity.class);
                intent.putExtra("resourceId", att.getImgResource());
                intent.putExtra("att_name",att.getName());
                intent.putExtra("att_detail", att.getDetail());
                startActivity(intent);
            }
        });
        return rootView;
    }

    protected abstract ArrayList<Attraction> getAttsInfo();
}
