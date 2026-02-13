package com.narxoz.rpg.character;

public interface Weapon{
    String getName();
    int getDamage();
}


public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    // TODO: Add fields for equipped weapon and armor
    // Think: Should Warrior know about its equipment?


    public Warrior(String name) {
        this.name = name;
        // Warrior stats: high health and strength, low mana and intelligence
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }

    // TODO: Implement methods from Character interface
    // You need to define those methods in Character interface first!

    // Example method structure:
    public String getName() {
        return name;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    // TODO: Add equipment-related methods
    // Examples:
    // - void equipWeapon(Weapon weapon)
    // - void equipArmor(Armor armor)
    // - void displayEquipment()

}
