package com.inatechno.trainingbasic2.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.fragment.app.Fragment;

import com.inatechno.trainingbasic2.adapter.CustomListGridAdapter;
import com.inatechno.trainingbasic2.databinding.FragmentCustomlistgridBinding;
import com.inatechno.trainingbasic2.view.DetailCustomGridActivity;

import static com.inatechno.trainingbasic2.data.DataBuah.detailBuah;
import static com.inatechno.trainingbasic2.data.DataBuah.gambarBuah;
import static com.inatechno.trainingbasic2.data.DataBuah.namaBuah;
import static com.inatechno.trainingbasic2.data.DataBuah.suaraBuah;


public class CustomListGridBuahFragment extends Fragment {

    FragmentCustomlistgridBinding binding;
    int kode;

    public CustomListGridBuahFragment(int i) {
        kode = i;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCustomlistgridBinding.inflate(inflater, container, false);
        View v = binding.getRoot();

        if (kode == 1) {
            binding.gridBuah.setVisibility(View.GONE);
            binding.customlist.setVisibility(View.VISIBLE);
            CustomListGridAdapter adapter = new CustomListGridAdapter(getActivity(),
                    getResources().getStringArray(namaBuah), gambarBuah, kode);
            binding.customlist.setAdapter(adapter);
            binding.customlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getActivity(), DetailCustomGridActivity.class);
                    intent.putExtra("nB", getResources().getStringArray(namaBuah)[position]);
                    intent.putExtra("gB", gambarBuah[position]);
                    intent.putExtra("dB", getResources().getStringArray(detailBuah)[position]);
                    intent.putExtra("sB", suaraBuah[position]);
                    startActivity(intent);
                }
            });
        } else {
            CustomListGridAdapter adapter = new CustomListGridAdapter(getActivity(),
                    getResources().getStringArray(namaBuah), gambarBuah, kode);
            binding.gridBuah.setAdapter(adapter);
            binding.gridBuah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getActivity(), DetailCustomGridActivity.class);
                    intent.putExtra("nB", getResources().getStringArray(namaBuah)[position]);
                    intent.putExtra("gB", gambarBuah[position]);
                    intent.putExtra("dB", getResources().getStringArray(detailBuah)[position]);
                    intent.putExtra("sB", suaraBuah[position]);
                    startActivity(intent);
                }
            });
        }

        return v;
    }
}