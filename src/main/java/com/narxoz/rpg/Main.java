package com.narxoz.rpg;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new WarriorFactory();
        Character hero = factory.createCharacter("арагорн");
        
        EquipmentFactory eqFactory = new MedievalEquipmentFactory();
        hero.setWeapon(eqFactory.createWeapon());
        
        hero.displayStats();
        System.out.println(hero.useSpecialAbility());
    }
}
