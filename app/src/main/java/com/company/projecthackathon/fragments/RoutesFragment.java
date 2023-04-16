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
import com.company.projecthackathon.adapters.MyAdapter;
import com.company.projecthackathon.databinding.FragmentRoutesBinding;
import com.company.projecthackathon.views.Item;

import java.util.ArrayList;
import java.util.List;

public class RoutesFragment extends Fragment {
    FragmentRoutesBinding binding;
    private final List<Item> data = new ArrayList<>();

    public RoutesFragment() {
        super(R.layout.fragment_routes);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentRoutesBinding.inflate(getLayoutInflater());
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        binding.recyclerView.setAdapter(new MyAdapter(data));
        setInitialData();
        binding.recyclerView.setAdapter(new MyAdapter(data));
    }

    private void setInitialData(){

        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 1));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 2));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 3));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 4));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 5));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 6));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 7));
        data.add(new Item("Название", "Простое описание", R.drawable.test, false, R.drawable.love, 8));


    }
}
