package com.inatechno.trainingbasic2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.inatechno.trainingbasic2.helper.PrefManager;

public class SplashScreenActivity extends AppCompatActivity {
    //new splash
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                PrefManager manager = new PrefManager(SplashScreenActivity.this);
                if (manager.isFirstTimeLaunch()) {
                    startActivity(new Intent(SplashScreenActivity.this, IntroSliderActivity.class));
                } else {
                    startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                }
                finish();

            }
        }, 3000);
    }
}