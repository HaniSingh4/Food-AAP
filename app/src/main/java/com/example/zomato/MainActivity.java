package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.zomato.Adapters.MainAdapter;
import com.example.zomato.Models.MainModel;
import com.example.zomato.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.f4,"Dosa","89","Dosa is famous for its simple ingredients and savory, slightly bitter flavor. It can be eaten as a snack, breakfast, or anytime you're in the mood for a delicious, savory meal!"));
        list.add(new MainModel(R.drawable.food1,"Pizza","9","A delicious pizza has an intensely cheesy flavor. The combination of tomato sauce and cheese creates a perfect marriage of flavor. "));
        list.add(new MainModel(R.drawable.food2,"Salid","8","green vegetables (as lettuce) often with tomato, cucumber, or radish served with dressing"));
        list.add(new MainModel(R.drawable.food3,"Burger","7"," a flat round mass of minced meat or vegetables, which is fried and often eaten in a bread roll."));
        list.add(new MainModel(R.drawable.food4,"Samosa","6","spicy and sweet, with a great crispy crust surrounding a piping hot filling. "));
        list.add(new MainModel(R.drawable.f4,"Kadhai_Paneer","90","Kadai paneer is a restaurant style delicious spicy paneer recipe made with fresh ground kadai masala, paneer, onions, tomatoes & bell peppers"));
        list.add(new MainModel(R.drawable.f4,"Veg_thali","100","In a traditional thali, the different curries and sauces are placed around the sides with a heap of rice positioned in the centre."));
        list.add(new MainModel(R.drawable.food8,"Rice_paneer","89"," Paneer fried rice is an Indian-Chinese fried rice variety made with rice, paneer (Indian cottage cheese), mixed vegetables, spices and soya ..."));
        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerViewMain.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerViewMain.setLayoutManager(layoutManager);
    }
}