package com.example.alaborg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class WelcomeMessage extends AppCompatActivity {

    private static int TIME_OUT = 3000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("WelcomeMessage", "OnCreate activated!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_message);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(WelcomeMessage.this, MainActivity.class);
                startActivity(i);
                finish();
            }
         },TIME_OUT);
    }

    @Override
    protected void onStart() {
        Log.i("WelcomeMessage", "OnStart activated!");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.i("WelcomeMessage", "onResume activated!");
        super.onResume();
    }

    @Override
    protected void onStop(){
        Log.i("WelcomeMessage", "onStop activated!");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("WelcomeMessage", "onDestory activated!");
        super.onDestroy();

    }
}
