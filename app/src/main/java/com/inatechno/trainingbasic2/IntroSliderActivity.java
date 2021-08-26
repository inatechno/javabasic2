package com.inatechno.trainingbasic2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.inatechno.trainingbasic2.adapter.PagerIntroAdapter;
import com.inatechno.trainingbasic2.databinding.ActivityIntroSliderBinding;
import com.inatechno.trainingbasic2.helper.PrefManager;

public class IntroSliderActivity extends AppCompatActivity {
    int layoutIntro[];
    ActivityIntroSliderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroSliderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        layoutIntro = new int[]{
                R.layout.intro1,
                R.layout.intro2,
                R.layout.intro3,
        };

        PagerIntroAdapter adapter = new PagerIntroAdapter(this, layoutIntro);
        binding.viewpagerintro.setAdapter(adapter);
        binding.viewpagerintro.addOnPageChangeListener(pageChangeListener);
        binding.btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentIntro = getItemIntro(1);
                if (currentIntro<layoutIntro.length){
                    binding.viewpagerintro.setCurrentItem(currentIntro);
                }else {
                    pindahHalaman();
                }
            }
        });
        binding.btnskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahHalaman();
            }
        });
    }
    private void pindahHalaman() {
        PrefManager manager = new PrefManager(this);
        manager.setFirstTimeLaunch(false);
        startActivity(new Intent(this,MainActivity.class));
        finish();

    }
    private int getItemIntro(int i) {
        return binding.viewpagerintro.getCurrentItem()+i;
    }
    ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if (position == layoutIntro.length - 1) {
                binding.btnnext.setText("Got IT");
                binding.btnskip.setVisibility(View.GONE);
            } else {
                binding.btnnext.setText("Next");
                binding.btnskip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}