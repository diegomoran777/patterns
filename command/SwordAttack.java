package com.patterns.command;

public class SwordAttack implements IAttack {

    @Override
    public <T> void execute(T t) {
        System.out.println("Attacking with sword");       
    }
    
}
