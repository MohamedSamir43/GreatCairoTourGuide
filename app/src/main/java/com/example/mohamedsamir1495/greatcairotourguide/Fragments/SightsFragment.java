package com.example.mohamedsamir1495.greatcairotourguide.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mohamedsamir1495.greatcairotourguide.Models.Location;
import com.example.mohamedsamir1495.greatcairotourguide.Adapters.listAdapter;
import com.example.mohamedsamir1495.greatcairotourguide.R;
import com.example.mohamedsamir1495.greatcairotourguide.Models.Sights;

import java.util.ArrayList;
import java.util.List;

public class SightsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        Sights.initSightsList(list, getContext());

        listAdapter adapter = new listAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}
