package com.example.zomato.Models;

import android.widget.ImageView;
import android.widget.TextView;

public class MainModel {
    int image;
    String name,price,dis;

    public MainModel(int image, String name, String price, String dis) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.dis = dis;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }
}

