package com.coderzf1.testjavatokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.coderzf1.testjavatokotlin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //make use of ViewBinding if you're going to be using XML for your UI
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TestKotlinClass tc = new TestKotlinClass();
        binding.textview.setText(tc.getHelloWorld());
    }
}