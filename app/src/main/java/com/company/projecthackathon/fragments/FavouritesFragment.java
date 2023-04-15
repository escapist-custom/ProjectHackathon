package com.company.projecthackathon.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.company.projecthackathon.R;
import com.company.projecthackathon.databinding.FragmentFavouritesBinding;

public class FavouritesFragment extends Fragment {
    private RecyclerView tweetsRecyclerView;
    FragmentFavouritesBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        binding = FragmentFavouritesBinding.inflate(getLayoutInflater());
        initRecyclerView();
    }

    private void initRecyclerView() {
        tweetsRecyclerView = binding.recyclerView;
        tweetsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

}
