package com.interfaces.interfaces_2;

public abstract class DisciplinaDecorator implements IDisciplina {
    

    protected IDisciplina disciplinaDecorator;

    public DisciplinaDecorator(IDisciplina disciplinaDecorator) {
        this.disciplinaDecorator = disciplinaDecorator;
    }


    @Override
    public void accion(Disciplina disciplina) {
        this.disciplinaDecorator.accion(disciplina);
        
    }
}
