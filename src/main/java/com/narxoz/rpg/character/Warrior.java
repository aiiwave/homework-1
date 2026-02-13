package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Warrior extends Character {
    public Warrior(String name){
        super(name);
        this.health = 180;
        this.mana = 20;
        this.strength = 90;
        this.intelligence = 10;
    }
    @Override
    public String getCharacterClass(){
        return "Warrior";
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
    public String useSpecialAbility() {
        return name + " uses 'POWER OF THE GODS'! He is now stronger!";
    }
    public void equipWeapon(Weapon weapon){
        setWeapon(weapon);
        System.out.println(this.name + " takes the " + weapon.getName());}

    public void equipArmor(Armor armor){
        setArmor(armor);
        System.out.println(this.name + " puts on the " + armor.getName());}}
