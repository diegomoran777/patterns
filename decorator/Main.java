package com.patterns.decorator;

public class Main {
    
    public static void main(String[] args) {
        
        //Armadura
        Armor armor = new Armor();

        //Tipos de armadura
        IArmor medievalArmor = new MedievalArmor();
        //IArmor clasicArmor = new ClasicArmor();

        //Decoradores de armadura que le brindan proteccion a la misma
        IArmor medievalArmorProtected = new Helmet(new Chest(new ShouldersPads(medievalArmor)));
        //IArmor clasicArmorProtected = new Helmet(new Chest(new ShouldersPads(clasicArmor)));

        //Pasamos la armadura
        medievalArmorProtected.protection(armor);
        //clasicArmorProtected.protection(armor);
 
        //Enemigo o personaje
        //Enemy enemy = new Enemy("Drako", "Monster", armor);

        //Resultado desde el enemigo o personaje
        //System.out.println(enemy.getArmor().getAllProtection());

    }
}
