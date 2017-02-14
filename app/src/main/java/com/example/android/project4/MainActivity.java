package com.example.android.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView restaurant = (TextView)findViewById(R.id.restaurant);

        restaurant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent restaurantIntent = new Intent(MainActivity.this,RestaurantActivity.class);

                startActivity(restaurantIntent);
            }
        });

        TextView cafe = (TextView)findViewById(R.id.cafe);

        cafe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent cafeIntent = new Intent(MainActivity.this,CafeActivity.class);

                startActivity(cafeIntent);
            }
        });

        TextView park = (TextView)findViewById(R.id.parks);

        park.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent parkIntent = new Intent(MainActivity.this,ParkActivity.class);

                startActivity(parkIntent);
            }
        });

        TextView museum = (TextView)findViewById(R.id.museums);

        museum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent museumIntent = new Intent(MainActivity.this,MuseumActivity.class);

                startActivity(museumIntent);
            }
        });
    }
}
