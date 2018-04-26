package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AttractionDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_detail);

        Intent intent = getIntent();
        setTitle(intent.getStringExtra("att_name"));
        ImageView img = (ImageView) findViewById(R.id.image_detail);
        img.setImageResource(intent.getIntExtra("resourceId", 0));
        TextView nameTextView = (TextView) findViewById(R.id.att_name);
        nameTextView.setText(intent.getStringExtra("att_name"));
        TextView detailTextView = (TextView) findViewById(R.id.att_detail);
        detailTextView.setText(intent.getStringExtra("att_detail"));
    }
}
