package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public abstract class Character{
    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;
    protected Weapon weapon;
    protected Armor armor;

    public Character(String name){
        this.name = name;
    }
    public abstract String useSpecialAbility();
    public abstract String getCharacterClass();
    public abstract void displayStats();

    public void setWeapon(Weapon weapon){this.weapon = weapon;}
    public void setArmor(Armor armor){this.armor = armor;}

    public String getDetails(){
        return String.format(
            "Name: %s [%s]\nHP: %d, MP: %d\nSTR: %d, INT: %d",
            name, getCharacterClass(), health, mana, strength, intelligence
        );
    }
    public String getName(){return name;}
}

