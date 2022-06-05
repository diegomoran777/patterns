package com.patterns.decorator;

public class Enemy {
    
    private String name;
    private String type;
    private Armor armor;

    public Enemy(String name, String type, Armor armor) {
        this.name = name;
        this.type = type;
        this.armor = armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Armor getArmor() {
        return this.armor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
