package com.example.zomato.Models;

public class OrderModel {
    int imageOrder;
    String nameOrder,numberOrder,priceOrder;

    public OrderModel(int imageOrder, String nameOrder, String numberOrder, String priceOrder) {
        this.imageOrder = imageOrder;
        this.nameOrder = nameOrder;
        this.numberOrder = numberOrder;
        this.priceOrder = priceOrder;
    }

    public int getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(int imageOrder) {
        this.imageOrder = imageOrder;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(String priceOrder) {
        this.priceOrder = priceOrder;
    }
}
