package com.patterns.command;

public class AxeAttack implements IAttack{

    @Override
    public <T> void execute(T t) {
        System.out.println("Attacking with axe " + t.getClass().getSimpleName());
    }
    
}
