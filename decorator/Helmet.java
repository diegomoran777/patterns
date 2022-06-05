package com.patterns.decorator;

public class Helmet extends ArmorDecorator {

    public Helmet(IArmor armorDecorator) {
        super(armorDecorator);
    }

    @Override
    public void protection(Armor armor) {
        armor.addProtection(3);
        armorDecorator.protection(armor);
    }
    
}
