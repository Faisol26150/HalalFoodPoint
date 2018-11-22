package com.aburubban.halalfoodfinder.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aburubban.halalfoodfinder.Interface.ItemClickListener;
import com.aburubban.halalfoodfinder.R;

/**
 * Created by Abu Rubban on 25/2/2561.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView food_name;
    public ImageView food_image,fav_image;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public FoodViewHolder(View itemView){
        super(itemView);

        food_name = (TextView)itemView.findViewById(R.id.food_name);
        food_image = (ImageView)itemView.findViewById(R.id.food_image);
        fav_image = (ImageView)itemView.findViewById(R.id.fav);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){
        itemClickListener.onClick(view,getAdapterPosition(),false);


    }
}
