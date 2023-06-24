package com.example.zomato.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zomato.Models.OrderModel;
import com.example.zomato.OrdersActivity;
import com.example.zomato.R;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.viewholder> {
    ArrayList<OrderModel>list1;
    Context context;

    public OrderAdapter(ArrayList<OrderModel> list, OrdersActivity ordersActivity) {
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_order_layout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final OrderModel model1 = list1.get(position);
        holder.order_image.setImageResource(model1.getImageOrder());
        holder.order_name.setText(model1.getNameOrder());
        holder.order_price.setText(model1.getPriceOrder());
        holder.order_number.setText(model1.getNameOrder());

    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView order_image;
        TextView order_number,order_price,order_name;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            order_image = itemView.findViewById(R.id.image_order);
            order_number = itemView.findViewById(R.id.number_order);
            order_price= itemView.findViewById(R.id.price_order);
            order_name = itemView.findViewById(R.id.nameorder);
            
            
        }
    }
}
