package com.patterns.decorator;

public class ClasicArmor implements IArmor{

    @Override
    public void protection(Armor armor) {
        System.out.println(armor.getAllProtection());        
    }
    
}
