package com.example.android.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 재은 on 2017-02-13.
 */

public class MuseumActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Detail> lists = new ArrayList<Detail>();
        lists.add(new Detail("The Museum of Modern Art", "11 W 53rd St, New York, NY 10019", R.drawable.museum, 2127089400));
        lists.add(new Detail("The Metropolitan Museum of Art", "1000 5th Ave, New York, NY 10028", R.drawable.museum, 2125357710));
        lists.add(new Detail("American Museum of Natural History", " Central Park West & 79th St, New York, NY 10024", R.drawable.museum, 2127695100));
        lists.add(new Detail("Solomon R. Guggenheim Museum", "1071 5th Ave, New York, NY 10128", R.drawable.museum, 2124233500));
        lists.add(new Detail("Whitney Museum of American Art", "99 Gansevoort St, New York, NY 10014", R.drawable.museum, 2125703600));
        lists.add(new Detail("Museum of Sex", "233 5th Ave, New York, NY 10016", R.drawable.museum, 2126896337));
        lists.add(new Detail("The Morgan Library & Museum", " 225 Madison Ave, New York, NY 10016", R.drawable.museum, 2126850008));


        DetailAdapter adapter = new DetailAdapter(this, lists, R.id.museums);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
