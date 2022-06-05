package com.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class AttackExecutor implements IAttack{

    List<IAttack> attackList = new ArrayList<>();

    public void addAttack(IAttack attack) {
        attackList.add(attack);
    }

    @Override
    public <T> void execute(T t) {
        attackList.forEach(a -> a.execute(t));
    }
    
}
