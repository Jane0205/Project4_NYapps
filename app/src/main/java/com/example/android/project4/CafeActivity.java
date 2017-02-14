package com.example.android.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 재은 on 2017-02-13.
 */

public class CafeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Detail> lists = new ArrayList<Detail>();
        lists.add(new Detail("Café Carlyle", "The Carlyle, A Rosewood Hotel, 35 E 76th St, New York", R.drawable.cafe, 2127441600));
        lists.add(new Detail("Mamajuana Cafe", "247 Dyckman St, New York", R.drawable.cafe,2123040140 ));
        lists.add(new Detail("Piccolo Cafe", "313 Amsterdam Ave, New York", R.drawable.cafe, 2128730962));
        lists.add(new Detail("Macaron Cafe", "44 E 59th St, New York, NY 10022", R.drawable.cafe, 2124862470));
        lists.add(new Detail("Caffe Bene", "9 Edward M Morgan Pl, New York, NY 10032", R.drawable.cafe,467915518));
        lists.add(new Detail("Europa Cafe", "205 W 57th St # 2, New York, NY 10019", R.drawable.cafe, 2129774030));
        lists.add(new Detail("Café Habana", "17 Prince St, New York, NY 10012", R.drawable.cafe, 2126252001));
        lists.add(new Detail("Joe Pro Shop & Headquarters", " 131 W 21st St, New York, NY 10011", R.drawable.cafe,2129247400));


        DetailAdapter adapter = new DetailAdapter(this, lists, R.color.cafe);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
