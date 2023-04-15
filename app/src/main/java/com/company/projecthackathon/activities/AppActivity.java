package com.company.projecthackathon.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.company.projecthackathon.R;
import com.company.projecthackathon.databinding.ActivityAppBinding;
import com.company.projecthackathon.fragments.FavouritesFragment;
import com.company.projecthackathon.fragments.MapFragment;
import com.company.projecthackathon.fragments.RoutesFragment;
import com.company.projecthackathon.fragments.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.navigation, FavouritesFragment.class, null)
                    .commit();
        }

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.map:
                        if (savedInstanceState == null) {
                            getSupportFragmentManager().beginTransaction()
                                    .add(R.id.fragment_container_view, MapFragment.class, null)
                                    .commit();
                        }
                        break;
                    case R.id.routes_list:
                        if (savedInstanceState == null) {
                            getSupportFragmentManager().beginTransaction()
                                    .add(R.id.fragment_container_view, RoutesFragment.class, null)
                                    .commit();
                        }
                        break;
                    case R.id.favourite_routes_list:
                        if (savedInstanceState == null) {
                            getSupportFragmentManager().beginTransaction()
                                    .add(R.id.fragment_container_view, FavouritesFragment.class, null)
                                    .commit();
                        }
                        break;
                    case R.id.settings:
                        if (savedInstanceState == null) {
                            getSupportFragmentManager().beginTransaction()
                                    .add(R.id.fragment_container_view, SettingsFragment.class, null)
                                    .commit();
                        }
                        break;

                }
                return true;
            }
        });

    }
}
