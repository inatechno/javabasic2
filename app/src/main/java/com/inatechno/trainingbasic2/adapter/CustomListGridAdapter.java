package com.inatechno.trainingbasic2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.fragment.app.FragmentActivity;

import com.inatechno.trainingbasic2.databinding.CustomgridBinding;
import com.inatechno.trainingbasic2.databinding.CustomlistBinding;


public class CustomListGridAdapter extends BaseAdapter {

    String[] namaBuah;
    int[] gambar;
    FragmentActivity act;
    int kode;
    public CustomListGridAdapter(FragmentActivity activity, String[] namaBuah, int[] gambarBuah, int kode) {
        this.namaBuah = namaBuah;
        gambar = gambarBuah;
        act = activity;
        this.kode =kode;
    }

        // untuk menghitung total data yang akan di load / tampilkan
    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    // untuk mengatur tampilan yang akan dimunculkan
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (kode==1){
            CustomlistBinding binding = CustomlistBinding.inflate(inflater);
            convertView = binding.getRoot();
            binding.imgbuah.setImageResource(gambar[position]);
            binding.txtnamabuah.setText(namaBuah[position]);
        }else{
            CustomgridBinding binding = CustomgridBinding.inflate(inflater);
            convertView = binding.getRoot();
            binding.imgbuah.setImageResource(gambar[position]);
            binding.txtnamabuah.setText(namaBuah[position]);
        }

        return convertView;
    }
}
