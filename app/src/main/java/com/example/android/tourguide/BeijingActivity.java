package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeijingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beijing);

        String[] names = {"故宫博物院","八达岭长城","颐和园","恭王府","圆明园","水立方","北京动物园","富国海底世界","观复博物馆","国子监"};
        String[] details = {};
        String[] addresses = {};
        int[] resourceIds = {};
        ArrayList<Attraction> atts = new ArrayList<>();
        for(int i = 0; i < names.length; i ++){
            Attraction att = new Attraction(names[i], addresses[i], details[i], resourceIds[i]);
            atts.add(att);
        }

        ListView lv = (ListView) findViewById(R.id.list_view);
        lv.setAdapter(new AttractionAdapter(this, atts));


//        lv.setOnItemClickListener();

    }
}
