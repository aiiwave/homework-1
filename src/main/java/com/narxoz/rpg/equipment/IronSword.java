package com.narxoz.rpg.equipment;

public class IronSword implements Weapon{
    private String name;
    private int damage;

    public IronSword(){
        this.name = "Iron Sword";
        this.damage = 25;}

    @Override
    public String getName(){
        return name;}
    @Override
    public int getDamageValue(){
        return damage;}

    @Override
    public String getAttackAction(){
        return "Swings a heavy iron blade";}

    @Override
    public String getDamageType() {
        return "Physical";}}
