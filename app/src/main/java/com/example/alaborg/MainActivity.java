package com.example.alaborg;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Álaborg", "Main activity is being created..");

        Button btn_about_us = (Button)findViewById(R.id.btn_about_us);
        Button btn_contact_us = (Button)findViewById(R.id.btn_contact_us);
        Button btn_map = (Button)findViewById(R.id.btn_map);
        Button btn_barcard = (Button)findViewById(R.id.btn_barcard);
        Button btn_test = (Button)findViewById(R.id.btn_test);
        Button btn_profile = (Button)findViewById(R.id.btn_profile);

        btn_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, about_us.class));
            }
        });

        btn_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, contact_us.class));
            }
        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, map.class));
            }
        });

        btn_barcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, barcardActivity.class));
            }
        });

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, test.class));
            }
        });

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, profile.class));
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("onStart", "OnStart activated!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("onResume", "onResume activated!");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("onPause", "onPause activated!");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("onStop", "onStop activated!");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("onDestroy", "onDestroy activated!");

    }
}
