package com.example.myapplication;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {
    private NavController navController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Initialize the NavController
        navController = Navigation.findNavController(this, R.id.navHostFragmentContainerView);
        // Handle navigation up
        return navController.navigateUp() || super.onSupportNavigateUp();
    }


    }
