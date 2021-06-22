package com.company;

public class Character {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int attackPower;
    private int speed;

    public Character(String name, int strength, int health, int stamina, int attackPower, int speed) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.speed = speed;
    }


    public int run() {
        speed ++;
        return speed;
    }

    public int attack(){

        health --;
        return health;
    }

    public int heal() {

        health++;
        return health;
    }

    public int decreaseHealth() {

        health--;
        return health--;
    }

    public int increaseStamina() {

        stamina++;
        return stamina;
    }

    public int decreaseStamina() {

        stamina--;
        return stamina;
    }
}
