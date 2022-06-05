package com.patterns.decorator;

public abstract class ArmorDecorator implements IArmor {
    
    protected IArmor armorDecorator;

    public ArmorDecorator (IArmor armorDecorator) {
        this.armorDecorator = armorDecorator;
    }

    @Override
    public void protection(Armor armor) {
        this.armorDecorator.protection(armor);
    }

}
