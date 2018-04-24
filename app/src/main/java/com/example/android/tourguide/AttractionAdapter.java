package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(Context context, ArrayList<Attraction> atts){
        super(context, 0, atts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_attractions, parent, false);
        }
        Attraction att = getItem(position);

        TextView titleTextView = (TextView)listItemView.findViewById(R.id.item_title);
        titleTextView.setText(att.getName());
        TextView detailTextView = (TextView) listItemView.findViewById(R.id.item_detail);
        detailTextView.setText(att.getDetail());
        ImageView imageImageView = (ImageView) listItemView.findViewById(R.id.item_image);
        imageImageView.setImageResource(att.getImgResource());

        return listItemView;
    }
}
