package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getItem(String item){

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
        FragmentManager fm = (FragmentManager) getSupportFragmentManager();
            Content cont = (Content) fm.findFragmentById(R.id.f2);
            cont.getSelectedItem(item);
        }else{

            Intent i = new Intent(getApplicationContext(),ContentActivity.class);
            i.putExtra("data",item);
            startActivity(i);
        }
    }

}