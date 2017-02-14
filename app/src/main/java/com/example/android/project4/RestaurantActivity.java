package com.example.android.project4;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.EventLogTags;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by 재은 on 2017-02-13.
 */

public class RestaurantActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Detail> lists = new ArrayList<Detail>();
        lists.add(new Detail("Jean-Georges", "Trump International Hotel & Tower New York", R.drawable.restaurant, 2122993900));
        lists.add(new Detail("Gotham Bar and Grill", "12 E 12th St, New York, NY 10003", R.drawable.restaurant, 2126204020));
        lists.add(new Detail("Gramercy Tavern", "42 E 20th St, New York, NY 10003", R.drawable.restaurant, 2124770777));
        lists.add(new Detail("Babbo", "110 Waverly Pl, New York, NY 10011", R.drawable.restaurant, 2122213800));
        lists.add(new Detail("Carmine's", "200 W 44th St, New York, NY 10036", R.drawable.restaurant, 2122993900));
        lists.add(new Detail("Blue Ribbon Sushi", "119 Sullivan St, New York, NY 10012", R.drawable.restaurant, 2123430404));
        lists.add(new Detail("ABC Kitchen", "35 E 18th St, New York, NY 10003", R.drawable.restaurant, 2124755829));
        lists.add(new Detail("Tamarind Tribeca", "99 Hudson St, New York, NY 10013", R.drawable.restaurant, 2127759000));


        DetailAdapter adapter = new DetailAdapter(this, lists,R.id.restaurant);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Detail detail = lists.get(position);
//
//            }
//        });

    }

}
