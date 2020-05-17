package com.example.alaborg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Information", "onCreate.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("Information", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.i("Information", "onResume");
        super.onResume();
    }

    @Override
    protected void onStop(){
        Log.i("Information", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Information", "onDestory");
        super.onDestroy();
    }
}
