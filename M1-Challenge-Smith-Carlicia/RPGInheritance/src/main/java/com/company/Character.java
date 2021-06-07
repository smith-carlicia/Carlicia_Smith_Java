package com.company;

public class Character {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int attackPower;
    private int speed;

   public void run() {
       System.out.println("The character is running.");
   }

   public void attack(){
       System.out.println("The character has now made an attack..");
   }

   public void heal() {
       System.out.println("The character is now healing.");
   }

   public void decreaseHealth() {
       System.out.println("The character's health has decreased.");
   }

   public void increaseStamina() {
       System.out.println("The character's stamina has increased.");
   }

   public void decreaseStamina() {
       System.out.println("The character's stamina has decreased.");
   }
}
