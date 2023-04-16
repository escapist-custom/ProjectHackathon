package com.company.projecthackathon.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.company.projecthackathon.R;
import com.company.projecthackathon.databinding.ActivityDescriptionRouteBinding;

public class RouteDescriptionActivity extends AppCompatActivity {

    ActivityDescriptionRouteBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDescriptionRouteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.showInMaps.setOnClickListener(view -> {
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);
        });


    }
}
