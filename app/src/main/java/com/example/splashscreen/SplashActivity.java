package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent iHome = new Intent(SplashActivity.this,MainActivity.class);

        new Handler().postDelayed(new Runnable() {   // Asynchronous process/ thread
            @Override
            public void run() {
                startActivity(iHome);
                finish();
            }
        }, 4000);


    }
}