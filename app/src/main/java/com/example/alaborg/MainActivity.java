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

        Log.i("MainActivity", "OnCreate activated!");

        Button btn_about_us = findViewById(R.id.btn_about_us);
        Button btn_contact_us = findViewById(R.id.btn_contact_us);
        Button btn_map = findViewById(R.id.btn_map);
        Button btn_barcard = findViewById(R.id.btn_barcard);
        Button btn_test = findViewById(R.id.btn_test);
        Button btn_profile = findViewById(R.id.btn_profile);

        btn_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutUsActivity.class));
            }
        });

        btn_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContactUsActivity.class));
            }
        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapActivity.class));
            }
        });

        btn_barcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BarCardActivity.class));
            }
        });

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestActivity.class));
            }
        });

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivity", "OnStart activated!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivity", "onResume activated!");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivity", "onPause activated!");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity", "onStop activated!");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivity", "onDestroy activated!");

    }
}
