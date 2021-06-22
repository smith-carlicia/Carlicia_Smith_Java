package com.company;

public class App {

    public static void main(String[] args) {
        Warrior Bruce = new Warrior("Bruce", 75, 100, 100, 50, 10, 100);
            System.out.println("Bruce is " + Bruce.attack());
            System.out.println("Bruce's shield strength has decreased by " + Bruce.decreaseShieldStrength());



        Farmer Taylor = new Farmer("Taylor", 75, 100, 75, 10, 1);
            System.out.println("Taylor is " + Taylor.plow());
            System.out.println("Taylor is " + Taylor.harvest());



        Constable Greene = new Constable("Greene", 60, 100, 60, 20, 5);
            System.out.println("Greene's jurisidiction is in " + Greene.jurisdiction());
            System.out.println("Greene is " + Greene.arrest());


    }
}
