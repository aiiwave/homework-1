package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.CharacterFactory;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Main {
    public static void main(String[] args) {
        CharacterFactory charFactory = new CharacterFactory();
        EquipmentFactory equipFactory = new EquipmentFactory();

        Character myWarrior = charFactory.createCharacter("Warrior", "Aragorn");
        Weapon sword = equipFactory.createWeapon("Sword");
        Armor plate = equipFactory.createArmor("Plate");

        myWarrior.equipWeapon(sword);
        myWarrior.equipArmor(plate);

        myWarrior.displayStats();
        System.out.println(myWarrior.useSpecialAbility());
        System.out.println("\n-------------------\n");

        Character myMage = charFactory.createCharacter("Mage", "Gandalf");
        myMage.displayStats();
        System.out.println(myMage.useSpecialAbility());}}
