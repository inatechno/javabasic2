package com.inatechno.trainingbasic2.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.PagerAdapter;

import com.inatechno.trainingbasic2.IntroSliderActivity;

public class PagerIntroAdapter extends PagerAdapter {

    Activity act;
    int[] layoutIntro;
    public PagerIntroAdapter(IntroSliderActivity introSliderActivity, int[] layoutIntro) {
        this.layoutIntro = layoutIntro;
        act = introSliderActivity;
    }

    @Override
    public int getCount() {
        return layoutIntro.length;
    }

    @Override
    public boolean isViewFromObject(View view,  Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(  ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater)act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(layoutIntro[position],container,false);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
      container.removeView((View)object);
    }
}
