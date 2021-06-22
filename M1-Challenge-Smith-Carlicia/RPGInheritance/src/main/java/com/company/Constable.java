package com.company;

public class Constable extends Character{

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int attackPower, int speed) {
        super(name, strength, health, stamina, attackPower, speed);
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.jurisdiction = jurisdiction;
    }

    public String arrest() {
        return "Carrying out an arrest.";
    };

    public String jurisdiction() {
        return "London";
    }
}
