package com.inatechno.trainingbasic2.view;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.inatechno.trainingbasic2.R;

import java.io.IOException;

public class DetailCustomGridActivity extends AppCompatActivity {
TextView txtnamabuah,txtdetailbuah;
ImageView imgbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_custom_grid);
        txtnamabuah = findViewById(R.id.txtdetailnamabuah);
        txtdetailbuah = findViewById(R.id.txtdetailbuah);
        imgbuah = findViewById(R.id.imgdetailbuah);
        Intent getData = getIntent();
        txtnamabuah.setText(getData.getStringExtra("nB"));
        txtdetailbuah.setText(getData.getStringExtra("dB"));
        imgbuah.setImageResource(getData.getIntExtra("gB",0));
        MediaPlayer mp = new MediaPlayer();
        Uri lokasi = Uri.parse("android.resource://"+getPackageName()+"/"+getData.getIntExtra("sB",0));
        try {
            mp.setDataSource(this,lokasi);
            mp.prepare();
            mp.start();
        }catch (IOException e){
            Log.e("error",e.getMessage());
        }
    }
}