package com.interfaces.interfaces_2;

public class Maraton extends DisciplinaDecorator {

    public Maraton(IDisciplina disciplina) {
        super(disciplina);
    }

    @Override
    public void accion(Disciplina disciplina) {
    disciplina.addActividad("correr");
    disciplinaDecorator.accion(disciplina);        
    }
    
}
