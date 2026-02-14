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

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
        System.out.println(this.name + " takes the " + weapon.getName());
    }
    public void setArmor(Armor armor){
        this.armor = armor;
        System.out.println(this.name + " puts on the " + armor.getName());
    }}

