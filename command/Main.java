package com.patterns.command;

import com.patterns.decorator.Armor;
import com.patterns.decorator.Enemy;

public class Main {
    
    public static void main(String[] args) {
        
        Armor armor = new Armor();

        Enemy enemy = new Enemy("drako", "Monster", armor);

        IAttack swordAttack = new SwordAttack();
        IAttack axeAttack = new AxeAttack();

        AttackExecutor attackExecutor = new AttackExecutor();
        attackExecutor.addAttack(swordAttack);
        attackExecutor.addAttack(axeAttack);

        attackExecutor.execute(enemy);
    }
}
