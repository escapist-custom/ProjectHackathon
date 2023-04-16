package com.company.projecthackathon.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.company.projecthackathon.R;
import com.company.projecthackathon.adapters.MyAdapter2;
import com.company.projecthackathon.databinding.FragmentFavouritesBinding;
import com.company.projecthackathon.views.Item;

import java.util.ArrayList;
import java.util.List;

public class FavouritesFragment extends Fragment {

    FragmentFavouritesBinding binding;
    private final List<Item> data = new ArrayList<>();

    public FavouritesFragment() {
        super(R.layout.fragment_favourites);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFavouritesBinding.inflate(getLayoutInflater());
        binding.recyclerView2.setHasFixedSize(true);
        binding.recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        binding.recyclerView2.setAdapter(new MyAdapter2(data));
        setInitialData();
        binding.recyclerView2.setAdapter(new MyAdapter2(data));
    }

    private void setInitialData(){

        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 1));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 2));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 3));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 4));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 5));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 6));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 7));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.heart_clicked, 8));


    }

}
