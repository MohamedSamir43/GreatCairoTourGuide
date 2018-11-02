package com.example.mohamedsamir1495.greatcairotourguide.Models;

import android.content.Context;

import com.example.mohamedsamir1495.greatcairotourguide.Models.Location;
import com.example.mohamedsamir1495.greatcairotourguide.R;

import java.util.List;

public class Sights {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.sight_giza_pyramids),
                context.getString(R.string.sight_giza_pyramids_description),
                context.getString(R.string.sight_giza_pyramids_address),
                context.getString(R.string.sight_giza_pyramids_phone),
                context.getString(R.string.sight_giza_pyramids_schedule),
                context.getString(R.string.sight_giza_pyramids_price),
                R.drawable.pyramids
        ));


        list.add(new Location(
                context.getString(R.string.sight_egyptian_museum_name),
                context.getString(R.string.sight_egyptian_museum_description),
                context.getString(R.string.sight_egyptian_museum_address),
                context.getString(R.string.sight_egyptian_museum_phone),
                context.getString(R.string.sight_egyptian_museum_schedule),
                context.getString(R.string.sight_egyptian_museum_price),
                R.drawable.egyptian_museum
        ));

        list.add(new Location(
                context.getString(R.string.sight_cairo_citadel_name),
                context.getString(R.string.sight_cairo_citadel_description),
                context.getString(R.string.sight_cairo_citadel_address),
                context.getString(R.string.sight_cairo_citadel_phone),
                context.getString(R.string.sight_cairo_citadel_schedule),
                context.getString(R.string.sight_cairo_citadel_price),
                R.drawable.cairo_citadel
        ));
    }
}
