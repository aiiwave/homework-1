package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.*;

public class EquipmentFactory{
	public Weapon createWeapon(String type){
		if(type.equalsIgnoreCase("SWORD")) return new IronSword();
		return new Weapon("Common Weapon", 10);
	}
	public Armor createArmor(String type){
		return new Armor("Wizard Robe", 10);
	}}
