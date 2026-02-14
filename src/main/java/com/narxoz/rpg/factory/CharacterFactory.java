package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.*;

public class CharacterFactory{
	public com.narxoz.rpg.character.Character createCharacter(String type, String name){
		if(type.equalsIgnoreCase("WARRIOR")){
			return new Warrior(name);}
		else if(type.equalsIgnoreCase("MAGE")){
			return new Mage(name);}
		else if(type.equalsIgnoreCase("ARCHER")){
			return new Archer(name);}
		return null;
	}
}
