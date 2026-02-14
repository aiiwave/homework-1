package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Mage extends Character{
	public Mage(String name){
		super(name);
		this.health = 100;
        this.mana = 150;
        this.strength = 10;
        this.intelligence = 90;
	}
	@Override
	public String getCharacterClass(){
		return "Mage";}

	@Override
	pubilc void displayStats(){
		System.out.println("=== " + this.name + " (Mage) ===");
		System.out.println("Health: " + this.health);
        System.out.println("Mana: " + this.mana);
        System.out.println("Strength: " + this.strength);
        System.out.println("Intelligence: " + this.intelligence);

		String wName = (weapon != null) ? weapon.getName() : "No Staff";
		String aName = (armor != null) ? armor.getName() : "No Robe";
		System.out.println("Equipment: " + wName + ", " + aName);}

	@Override 
	public String useSpecialAbility(){
		return name + " casts 'FIREBALL'! Massive magic damage!";
	}}
	
