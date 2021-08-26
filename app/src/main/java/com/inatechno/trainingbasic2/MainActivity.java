package com.inatechno.trainingbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.inatechno.trainingbasic2.view.TabBuahActivity;
import com.inatechno.trainingbasic2.view.WaActivity;
import com.inatechno.trainingbasic2.view.YoutubeApiActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onYoutubeApi(View view) {
        startActivity(new Intent(this, YoutubeApiActivity.class));
    }

    public void onWA(View view) {
        startActivity(new Intent(this, WaActivity.class));

    }

    public void onPortalBerita(View view) {
    }

    public void onBuah(View view) {
        startActivity(new Intent(this, TabBuahActivity.class));
    }
}