package com.example.android.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 재은 on 2017-02-13.
 */

public class ParkActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Detail> lists = new ArrayList<Detail>();
        lists.add(new Detail("Central park","location",R.drawable.park));
        lists.add(new Detail("Bryant park","location",R.drawable.park));
        lists.add(new Detail("Union square","location",R.drawable.park));
        lists.add(new Detail("Washington square","location",R.drawable.park));
        lists.add(new Detail("Highline park","location",R.drawable.park));

        DetailAdapter adapter = new DetailAdapter(this,lists,R.color.parks);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
