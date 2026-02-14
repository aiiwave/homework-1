package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public abstract class Character {
    protected String name;
    protected int health, mana, strength, intelligence;
    protected Weapon weapon;
    protected Armor armor;

    public Character(String name) { this.name = name; }

    public void setWeapon(Weapon weapon) { this.weapon = weapon; }
    public void setArmor(Armor armor) { this.armor = armor; }

    public abstract void displayStats();
    public abstract String useSpecialAbility();
    public abstract String getCharacterClass();
}
