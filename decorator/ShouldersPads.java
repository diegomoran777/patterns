package com.patterns.decorator;

public class ShouldersPads extends ArmorDecorator {

    public ShouldersPads(IArmor armorDecorator) {
        super(armorDecorator);
    }

    @Override
    public void protection(Armor armor) {
        armor.addProtection(2);
        armorDecorator.protection(armor);
    }
    
}
