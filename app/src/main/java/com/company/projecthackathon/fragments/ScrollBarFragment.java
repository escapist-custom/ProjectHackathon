package com.company.projecthackathon.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.company.projecthackathon.databinding.FragmentScrollBarBinding;

public class ScrollBarFragment extends Fragment {
    FragmentScrollBarBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentScrollBarBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


}
