package com.patterns.decorator;

public class MedievalArmor implements IArmor {

    @Override
    public void protection(Armor armor) {
        System.out.println("My armor has " + armor.getAllProtection() + " levels of protection");
    }
    
}
