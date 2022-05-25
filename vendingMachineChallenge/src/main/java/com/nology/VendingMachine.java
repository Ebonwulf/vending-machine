package com.nology;

public class VendingMachine {

    public static void main(String[] args) {
        ChocolateBar snickers = new ChocolateBar("Snickers", Categories.CHOCOLATE_BARS, 0.58);
        ChocolateBar creamEgg = new ChocolateBar("Cream egg", Categories.CHOCOLATE_BARS, 0.40);
        Crisps paprika = new Crisps("Paprika crisps", Categories.CRISPS, 0.66);
        Crisps cheeseAndOnion = new Crisps("Cheese and onion crisps", Categories.CRISPS, 0.55);
        Drinks monster = new Drinks("Monster Ultra Black", Categories.DRINK, 1.70);
        Drinks pepsi = new Drinks("PepsiMax", Categories.DRINK, 0.89);
        CerealBars brunchBar = new CerealBars("Brunch Bar", Categories.CEREAL_BARS, 0.40);
        CerealBars frostiesBar = new CerealBars("Frosties Bar", Categories.CEREAL_BARS, 0.39);

        StockInitialiser stockInitialiser = new StockInitialiser();
        stockInitialiser.createStock(snickers);
        stockInitialiser.createStock(creamEgg);
        stockInitialiser.createStock(paprika);
        stockInitialiser.createStock(cheeseAndOnion);
        stockInitialiser.createStock(monster);
        stockInitialiser.createStock(pepsi);
        stockInitialiser.createStock(brunchBar);
        stockInitialiser.createStock(frostiesBar);
    }
}
