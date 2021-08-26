package com.inatechno.trainingbasic2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // pindah halaman
                startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                //akhiri halaman
                finish();
            }
        },3000);
    }
}