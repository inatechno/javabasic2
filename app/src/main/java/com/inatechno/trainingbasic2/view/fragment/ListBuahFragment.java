package com.inatechno.trainingbasic2.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;


import com.inatechno.trainingbasic2.databinding.FragmentListbuahBinding;

import static com.inatechno.trainingbasic2.data.DataBuah.namaBuah;


public class ListBuahFragment extends Fragment {

  FragmentListbuahBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentListbuahBinding.inflate(inflater,container, false);
        View v = binding.getRoot();
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,getResources().getStringArray(namaBuah));

        binding.listviewbiasa.setAdapter(adapter);
        return v;
    }
}