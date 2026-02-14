package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Archer{
    private String name;
    private int defense;

    public Armor(String name, int defense){
        this.name = name;
        this.defense = defense;
    }
    public String getName(){
        return name;
    }
    public int getDefenseValue(){
        return defense;
    }
}
