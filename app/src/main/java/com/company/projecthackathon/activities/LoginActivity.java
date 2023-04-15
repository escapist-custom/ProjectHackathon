package com.company.projecthackathon.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.company.projecthackathon.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.wantCreateAccount.setOnClickListener(view -> {
                    Intent intent = new Intent(this, RegistrationActivity.class);
                    startActivity(intent);
                    finish();
                }
        );

        binding.login.setOnClickListener(view -> {
                    Intent intent = new Intent(this, AppActivity.class);
                    startActivity(intent);
                    finish();
                }
        );


    }

}
