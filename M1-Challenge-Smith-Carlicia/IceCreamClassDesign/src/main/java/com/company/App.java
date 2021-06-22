package com.company;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {


        iceCreamShop pos = new iceCreamShop("birthday cake", 3.50, 3);
        System.out.println("That's an order of "+ pos.scoops() + " scoops of " + pos.flavor() + " coming right up!");


        iceCreamFactory order = new iceCreamFactory("cows milk", "strawberry", 15);
        System.out.println("Your order of " + order.getFlavor() + order.getBaseOfIcecream() + " for " + order.getPricePerGallon()  + " is on it's way");
    }
}
