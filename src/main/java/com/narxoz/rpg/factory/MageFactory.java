package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.*;
public class MageFactory extends CharacterFactory {
    @Override public Character createCharacter(String name) { return new Mage(name); }
}
