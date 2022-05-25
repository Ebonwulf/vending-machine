package com.nology;

public class Crisps extends Products{



    public Crisps(String name, Categories category, double price) {
        super(name, category, price);
    }

    public Crisps(String name, Categories category, boolean inStock) {
        super(name, category, inStock);
    }

}
