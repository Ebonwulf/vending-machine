package com.nology;

public class Products {
    public  String name;
    protected Categories category;
    public double price;

    public boolean inStock;

    public Products(String name, Categories category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Products(String name, Categories category, boolean inStock) {
        this.name = name;
        this.category = category;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }
}
