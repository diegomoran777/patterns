package com.patterns.decorator;

public class Chest extends ArmorDecorator {

    public Chest(IArmor armorDecorator) {
        super(armorDecorator);
    }

    @Override
    public void protection(Armor armor) {
        armor.addProtection(5);
        armorDecorator.protection(armor);
    }
    
}
