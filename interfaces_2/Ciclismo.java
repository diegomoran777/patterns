package com.interfaces.interfaces_2;

public class Ciclismo extends DisciplinaDecorator {

    public Ciclismo(IDisciplina disciplinaDecorator) {
        super(disciplinaDecorator);
    }

    @Override
    public void accion(Disciplina disciplina) {
        disciplina.addActividad("Andar en bici");
        disciplinaDecorator.accion(disciplina);
    }
    
}
