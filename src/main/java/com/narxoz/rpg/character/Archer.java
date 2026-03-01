package com.narxoz.rpg.character;
public class Archer extends Character {
    public Archer(String name) { super(name); this.health = 100; this.strength = 50; }
    @Override public void displayStats() { System.out.println("лучник: " + name + " [hp: " + health + "]"); }
    @Override public String useSpecialAbility() { return name + " стреляет из лука!"; }
    @Override public String getCharacterClass() { return "лучник"; }
}
