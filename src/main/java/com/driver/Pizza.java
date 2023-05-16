package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public static int basePrice = 0;
    public static int vegBasePrice = 300;
    public static int nonVegBasePrice = 400;
    public static int cheesePrice = 80;
    private boolean isCheeseAdded;
    public static int vegToppingPrice = 70;
    public static int nonVegToppingPrice = 120;
    private int myToppingPrice = 0;
    private boolean isToppingAdded;
    public static int takeAwayPrice = 20;
    private boolean isTakeAway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.basePrice = isVeg ? vegBasePrice : nonVegBasePrice;
        this.price = 0;
        this.bill = "";

        isCheeseAdded = false;
        isToppingAdded = false;
        isTakeAway = false;
    }

    public int getPrice(){

        this.price = basePrice;
        if(isCheeseAdded) this.price += cheesePrice;
        if(isToppingAdded)
        {
            myToppingPrice = isVeg ? vegToppingPrice : nonVegToppingPrice;
            this.price += myToppingPrice;
        }
        if(isTakeAway) this.price += takeAwayPrice;

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(! isCheeseAdded)
        {
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded)
        {
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(! isTakeAway)
        {
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.getPrice();
        String bill = "Base Price Of The Pizza: "+this.basePrice+"\n";
        if(isCheeseAdded) bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
        if(isToppingAdded) bill += "Extra Toppings Added: "+this.myToppingPrice+"\n";
        if(isTakeAway) bill += "Paperbag Added: "+this.takeAwayPrice+"\n";
        bill += "Total Price: "+this.price+"\n";

        this.bill = bill;
        return this.bill;
    }
}
