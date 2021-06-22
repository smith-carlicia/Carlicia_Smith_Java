package com.company;


public class Farmer extends Character {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;


    public Farmer(String name, int strength, int health, int stamina, int attackPower, int speed) {
        super(name, strength, health, stamina, attackPower, speed);
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public String harvest() {
        return "Harvesting the crops";
    }

    public String plow() {

        return "Plowing the crops.";
    }

    public int heal() {
        health++;

        return health;
    }
}
