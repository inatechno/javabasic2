package com.inatechno.trainingbasic2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.inatechno.trainingbasic2.R;
import com.inatechno.trainingbasic2.databinding.ActivityYoutubeApiBinding;

public class YoutubeApiActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
YouTubePlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityYoutubeApiBinding binding = ActivityYoutubeApiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.youtubeplayer.initialize("AIzaSyBsilLqkJBL-FbuorkCNHPApAtSKLDU4RI",this);
        binding.btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.play();
            }
        });
        binding.btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
    player = youTubePlayer;
    if (player!=null){
        if (b){
            player.play();
        }else{
            player.loadVideo("rVCJVWHtUXY");
        }
    }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "gagal memuat video youtube", Toast.LENGTH_SHORT).show();
    }
}