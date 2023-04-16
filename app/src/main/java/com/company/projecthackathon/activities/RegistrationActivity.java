package com.company.projecthackathon.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.company.projecthackathon.databinding.ActivityRegistrationBinding;

public class RegistrationActivity extends AppCompatActivity {
    ActivityRegistrationBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegistrationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.alreadyHaveAccount.setOnClickListener(view -> {
                    Intent intent = new Intent(this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
        );

        binding.register.setOnClickListener(view -> {
            if(isValidSignUpDetails()) {
                Intent intent = new Intent(this, AppActivity.class);
                startActivity(intent);
                finish();

            } else {
                isValidSignUpDetails();
            }
                }
        );

    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private Boolean isValidSignUpDetails() {
        if (binding.inputName.getText().toString().trim().isEmpty()) {
            showToast("Enter name");
            return false;
        } else if (binding.inputEmail.getText().toString().trim().isEmpty()) {
            showToast("Enter email");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.getText().toString()).matches()) {
            showToast("Enter valid email");
            return false;
        } else if (binding.inputPassword.getText().toString().trim().isEmpty()) {
            showToast("Enter password");
            return false;
        } else if (binding.repeatPassword.getText().toString().trim().isEmpty()) {
            showToast("Enter password again");
            return false;
        } else if (!binding.inputPassword.getText().toString().equals(binding.repeatPassword.getText().toString())) {
            showToast("Please enter the same passwords.");
            return false;
        } else {
            return true;
        }

    }

    private void loading(Boolean isLoading){
        if(isLoading){
            binding.register.setVisibility(View.INVISIBLE);
            binding.progressBar.setVisibility(View.VISIBLE);
        }else{
            binding.progressBar.setVisibility(View.INVISIBLE);
            binding.register.setVisibility(View.VISIBLE);
        }
    }
}
