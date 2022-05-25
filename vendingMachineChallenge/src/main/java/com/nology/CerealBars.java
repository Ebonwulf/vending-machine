package com.nology;

public class CerealBars extends Products{
    public CerealBars(String name, Categories category, double price) {
        super(name, category, price);
    }

    public CerealBars(String name, Categories category, boolean inStock) {
        super(name, category, inStock);
    }
}
