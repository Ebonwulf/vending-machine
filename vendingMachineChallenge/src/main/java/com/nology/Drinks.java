package com.nology;

public class Drinks extends Products{

    public Drinks(String name, Categories category, double price) {
        super(name, category, price);
    }

    public Drinks(String name, Categories category, boolean inStock) {
        super(name, category, inStock);
    }
}
