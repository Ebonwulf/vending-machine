package com.nology;

public class StockInitialiser {

    public  void createStock(Products name) {
        int stock = (int)Math.floor(Math.random()*(25 + 1));
        System.out.println(name);
        System.out.println(stock);

    }

}