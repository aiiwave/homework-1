package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.*;
public class ArcherFactory extends CharacterFactory {
    @Override public Character createCharacter(String name) { return new Archer(name); }
}
