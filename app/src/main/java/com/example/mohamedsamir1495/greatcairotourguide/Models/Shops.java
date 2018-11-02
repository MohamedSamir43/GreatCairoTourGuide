package com.example.mohamedsamir1495.greatcairotourguide.Models;

import android.content.Context;

import com.example.mohamedsamir1495.greatcairotourguide.R;

import java.util.List;


public class Shops {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shop_maadi_city_center_name),
                context.getString(R.string.shop_maadi_city_center_description),
                context.getString(R.string.shop_maadi_city_center_address),
                context.getString(R.string.shop_maadi_city_center_phone),
                context.getString(R.string.shop_maadi_city_center_schedule),
                null,
                R.drawable.maadi_city_center
        ));

        list.add(new Location(
                context.getString(R.string.shop_genena_mall_name),
                context.getString(R.string.shop_genena_mall_description),
                context.getString(R.string.shop_genena_mall_address),
                context.getString(R.string.shop_genena_mall_phone),
                context.getString(R.string.shop_genena_mall_schedule),
                null,
                R.drawable.genena_mall
        ));

        list.add(new Location(
                context.getString(R.string.shop_diwan_bookstore_name),
                context.getString(R.string.shop_diwan_bookstore_description),
                context.getString(R.string.shop_diwan_bookstore_address),
                context.getString(R.string.shop_diwan_bookstore_phone),
                context.getString(R.string.shop_diwan_bookstore_schedule),
                null,
                R.drawable.diwan_bookstore
        ));

    }
}
