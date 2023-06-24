package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.zomato.databinding.ActivityOrderSucessfullBinding;

public class OrderSucessfull extends AppCompatActivity {
ActivityOrderSucessfullBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderSucessfullBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}