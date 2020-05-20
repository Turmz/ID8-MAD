package com.example.alaborg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class Welcome_Message extends AppCompatActivity {

    private static int TIME_OUT = 3000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Information", "onCreate.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_message);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Welcome_Message.this, MainActivity.class);
                startActivity(i);
                finish();
            }
         },TIME_OUT);
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
