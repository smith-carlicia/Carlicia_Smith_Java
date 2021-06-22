package com.company;

public class iceCreamShop {
    private String flavor;
    private double pricePerScoop;
    private int scoops;

    public iceCreamShop(String flavor, double pricePerScoop, int scoops) {
        this.flavor = flavor;
        this.pricePerScoop = pricePerScoop;
        this.scoops = scoops;
    }

    public String flavor(){
        return "Birthday Cake";
    }

    public int scoops(){
        return 3;
    }

    public double totalPrice() {
        return pricePerScoop * scoops;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }
}
