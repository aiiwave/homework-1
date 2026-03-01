package com.narxoz.rpg.character;
public class Warrior extends Character {
    public Warrior(String name) { super(name); this.health = 150; this.strength = 80; }
    @Override public void displayStats() { System.out.println("воин: " + name + " [hp: " + health + "]"); }
    @Override public String useSpecialAbility() { return name + " бьет мечом!"; }
    @Override public String getCharacterClass() { return "воин"; }
}
