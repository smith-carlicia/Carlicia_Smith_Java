package com.company;

public class Warrior extends Character{

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int attackPower, int speed, int strength1) {
        super(name, strength, health, stamina, attackPower, speed);
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
    }

    public int decreaseShieldStrength() {
        shieldStrength--;

        return shieldStrength;
    }
}
