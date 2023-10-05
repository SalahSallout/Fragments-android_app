package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsList extends Fragment {

    public NewsList() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.newslist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView lv = this.getView().findViewById(R.id.listview);

        ArrayList<String> myNews = new ArrayList<String>();

        myNews.add("News 1 ..");
        myNews.add("News 2 ..");
        myNews.add("News 3 ..");
        myNews.add("News 4 ..");
        myNews.add("News 5 ..");
        myNews.add("News 6 ..");
        myNews.add("News 7 ..");

        ArrayAdapter<String> ad = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,myNews);
        lv.setAdapter(ad);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = lv.getItemAtPosition(i).toString();

                MainActivity activity = (MainActivity) NewsList.this.getActivity();
                activity.getItem(item);
            }
        });
    }
}