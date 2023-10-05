package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        String item= getIntent().getStringExtra("data");
        FragmentManager fm = (FragmentManager) getSupportFragmentManager();
        Content cont = (Content) fm.findFragmentById(R.id.f2);
        cont.getSelectedItem(item);
    }
}