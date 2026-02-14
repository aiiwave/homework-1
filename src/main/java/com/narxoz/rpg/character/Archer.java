package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Archer extends Character {
    public Archer(String name){
        super(name);
        this.health = 150;
        this.mana = 60;
        this.strength = 50;
        this.intelligence = 40;
    }
    @Override
    public String getCharacterClass(){
        return "Archer";
    }
    
    @Override
    public void displayStats() {
        System.out.println("=== " + this.name + " (Archer) ===");
        System.out.println("Health: " + this.health);
        System.out.println("Mana: " + this.mana);
        System.out.println("Strength: " + this.strength);
        System.out.println("Intelligence: " + this.intelligence);

        String wName = (weapon != null) ? weapon.getName() : "No Bow";
        String aName = (armor != null) ? armor.getName() : "No Leather Armor";
        System.out.println("Equipment: " + wName + ", " + aName);}

    @Override
    public String useSpecialAbility() {
        return name + " uses 'ARROW RAIN'! Multiple targets hit!";
    }}
