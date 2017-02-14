package com.example.android.project4;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by 재은 on 2017-02-13.
 */

public class DetailAdapter extends ArrayList<Detail> {

    private int mColorResourceId;


    public DetailAdapter(Context context, ArrayList<Detail> lists,int colorResourceId) {
        super(context, 0, lists,);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_ny, parent, false);
        }

        Detail currentDetail = get(position);

        TextView name = (TextView)listItemView.findViewById(R.id.name);
        name.setText(currentDetail.getname());

        TextView location = (TextView)listItemView.findViewById(R.id.location);
        location.setText(currentDetail.getlocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentDetail.hasImage()){
            imageView.setImageResource(currentDetail.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
