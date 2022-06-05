package com.patterns.decorator;

import java.util.ArrayList;

public class Armor {
    
    private ArrayList<Integer> protection;

    public Armor() {
        this.protection = new ArrayList<>();
    }
    

    public void setProtection(ArrayList<Integer> protection) {
        this.protection = protection;
    }

    public ArrayList<Integer> getProtection() {
        return this.protection;
    }

    public void addProtection(int protect) {
        this.protection.add(protect);
    }

    public int getAllProtection() {
        return this.protection.stream().reduce(0, (x, y) -> x + y);
    }
}
