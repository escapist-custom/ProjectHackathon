package com.company.projecthackathon.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

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
       if (binding.inputEmail.getText().toString().trim().isEmpty()) {
            showToast("Enter email");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.getText().toString()).matches()) {
            showToast("Enter valid email");
            return false;
        } else if (binding.inputPassword.getText().toString().trim().isEmpty()) {
            showToast("Enter password");
            return false;
        } else {
            return true;
        }

    }

    private void loading(Boolean isLoading){
        if(isLoading){
            binding.login.setVisibility(View.INVISIBLE);
            binding.progressBar.setVisibility(View.VISIBLE);
        }else{
            binding.progressBar.setVisibility(View.INVISIBLE);
            binding.login.setVisibility(View.VISIBLE);
        }
    }

}
