package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Warrior extends Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    public Warrior(String name){
        super(name);
        this.name = name;
        this.health = 180;
        this.mana = 20;
        this.strength = 90;
        this.intelligence = 10;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + this.name + " (Warrior) ===");
        System.out.println("Health: " + this.health);
        System.out.println("Mana: " + this.mana);
        System.out.println("Strength: " + this.strength);
        System.out.println("Intelligence: " + this.intelligence);

    String wName = (weapon != null) ? weapon.getName() : "No Weapon";
    String aName = (armor != null) ? armor.getName() : "No Armor";
    System.out.println("Equipment: " + wName + ", " + aName);}

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses 'POWER OF THE GODS'! He is now stronger!");
    }
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
        System.out.println(this.name + " takes the " + weapon.getName());}

    public void equipArmor(Armor armor){
        this.armor = armor;
        System.out.println(this.name + " puts on the " + armor.getName());}}
