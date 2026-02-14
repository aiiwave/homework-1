package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.factory.*;
import com.narxoz.rpg.factory.equipment.*;


public class Main {
    public static void main(String[] args) {
        CharacterFactory charFactory = new CharacterFactory();
        EquipmentFactory equipFactory = new EquipmentFactory();

        Character hero = charFactory.createCharacter("Warrior", "Aragorn");
        Weapon sword = equipFactory.createWeapon("Sword");
        Armor plate = equipFactory.createArmor("Plate");
    
        if(myWarrior != null){
            hero.setWeapon(sword);
            hero.setArmor(plate);
            System.out.println("Class: " + hero.useSpecialAbility());
            hero.displayStats();
            System.out.println("Action: " + hero.useSpecialAbility());
        }}}
