package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.zomato.Adapters.OrderAdapter;
import com.example.zomato.Models.OrderModel;
import com.example.zomato.databinding.ActivityOrdersBinding;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {
 ActivityOrdersBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<OrderModel> list= new ArrayList<>();
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
        list.add(new OrderModel(R.drawable.f4,"Burger","3","5"));
       OrderAdapter orderAdapter = new OrderAdapter(list,this);
       binding.recyclerViewOrders.setAdapter(orderAdapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.recyclerViewOrders.setLayoutManager(linearLayoutManager);
    }
}