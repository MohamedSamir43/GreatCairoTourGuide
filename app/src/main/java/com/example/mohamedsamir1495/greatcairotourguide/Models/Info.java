package com.example.mohamedsamir1495.greatcairotourguide.Models;

import android.content.Context;

import com.example.mohamedsamir1495.greatcairotourguide.R;

import java.util.List;

public class Info {

    public static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.info_internet_name),
                context.getString(R.string.info_internet_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_convenience_stores_name),
                context.getString(R.string.info_convenience_stores_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_transport_name),
                context.getString(R.string.info_transport_description),
                null,
                null,
                null,
                null,
                -1
        ));
    }
}
