package com.inatechno.trainingbasic2.view.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.inatechno.trainingbasic2.R;
import com.inatechno.trainingbasic2.view.fragment.ChatFragment;
import com.inatechno.trainingbasic2.view.fragment.ListBuahFragment;
import com.inatechno.trainingbasic2.view.fragment.PanggilanFragment;
import com.inatechno.trainingbasic2.view.fragment.StatusFragment;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapterBuah extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_buah_1, R.string.tab_buah_2, R.string.tab_buah_3};
    private final Context mContext;

    public SectionsPagerAdapterBuah(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new ListBuahFragment();
                break;
            case 1:
                fragment = new StatusFragment();
                break;
            case 2:
                fragment = new PanggilanFragment();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}