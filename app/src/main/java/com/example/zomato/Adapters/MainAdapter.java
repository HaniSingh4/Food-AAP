package com.example.zomato.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zomato.DetailActivity;
import com.example.zomato.Models.MainModel;
import com.example.zomato.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder> {
   ArrayList<MainModel>list;
   Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_main_layout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final MainModel model = list.get(position);
        holder.imageView.setImageResource(model.getImage());
        holder.namef.setText(model.getName());
        holder.pricef.setText(model.getPrice());
        holder.discriptionf.setText(model.getDis());

      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(context, DetailActivity.class);
              intent.putExtra("image",model.getImage());
              intent.putExtra("price",model.getPrice());
              intent.putExtra("desc",model.getDis());
              intent.putExtra("name",model.getName());

              context.startActivities(new Intent[]{intent});
          }
      });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView namef,pricef,discriptionf;
    public viewholder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_food);
        namef = itemView.findViewById(R.id.name_food);
        pricef = itemView.findViewById(R.id.price_food);
        discriptionf = itemView.findViewById(R.id.description_food);
    }
}
}
