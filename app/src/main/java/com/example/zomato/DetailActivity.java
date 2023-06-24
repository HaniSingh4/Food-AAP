package com.example.zomato;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zomato.databinding.ActivityDetailBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


import java.util.HashMap;
import java.util.Map;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;

    EditText nameText,phoneno;
    @SuppressLint("DefaultLocale")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

        int image = getIntent().getIntExtra("image",0);
        int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String name=getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("desc");
        binding.imageDetail.setImageResource(image);
        binding.priceDetail.setText(String.format("%d",price));

        binding.DescriptionDetail.setText(description);
        binding.phoneDetail.getText().toString();

       nameText=findViewById(R.id.food_detail_name);
       phoneno =findViewById(R.id.phone_detail);
        binding.orderbtnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(DetailActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                String nameString=nameText.getText().toString();
                String phoneNo=phoneno.getText().toString();

                Map<String,Object> map=new HashMap<>();
                map.put("name",nameString);
                map.put("phone",phoneNo);
                firebaseFirestore.collection("User").add(map).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentReference> task) {

                        if (task.isSuccessful()){
                            Log.e(TAG, "onComplete: ", task.getException());
                            Toast.makeText(DetailActivity.this, "Uploded", Toast.LENGTH_SHORT).show();

                            Intent intent=new Intent(DetailActivity.this,OrderSucessfull.class);
                            startActivity(intent);

                        }
                        else
                        {
                            Toast.makeText(DetailActivity.this, "error", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });



    }

    }
