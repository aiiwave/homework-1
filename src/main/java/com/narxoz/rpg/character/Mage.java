package com.narxoz.rpg.character;
public class Mage extends Character {
    public Mage(String name) { super(name); this.health = 70; this.intelligence = 90; }
    @Override public void displayStats() { System.out.println("маг: " + name + " [hp: " + health + "]"); }
    @Override public String useSpecialAbility() { return name + " пускает файербол!"; }
    @Override public String getCharacterClass() { return "маг"; }
}
