package com.example.mohamedsamir1495.greatcairotourguide.Models;

import android.content.Context;

import com.example.mohamedsamir1495.greatcairotourguide.R;

import java.util.List;

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_Ginza_name),
                context.getString(R.string.food_Ginza_description),
                context.getString(R.string.food_Ginza_address),
                context.getString(R.string.food_Ginza_phone),
                context.getString(R.string.food_Ginza_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.ginza_restaurant
        ));

        list.add(new Location(
                context.getString(R.string.food_zooba_name),
                context.getString(R.string.food_zooba_description),
                context.getString(R.string.food_zooba_address),
                context.getString(R.string.food_zooba_phone),
                context.getString(R.string.food_zooba_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.zooba_restaurrant
        ));

        list.add(new Location(
                context.getString(R.string.food_bab_hadid_name),
                context.getString(R.string.food_bab_hadid_description),
                context.getString(R.string.food_bab_hadid_address),
                context.getString(R.string.food_bab_hadid_phone),
                context.getString(R.string.food_bab_hadid_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.bab_hadid
        ));


    }
}
