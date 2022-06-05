package com.interfaces.interfaces_2;

public class Natacion extends DisciplinaDecorator {

    public Natacion(IDisciplina disciplina) {
        super(disciplina);
    }

    @Override
    public void accion(Disciplina disciplina) {
          disciplina.addActividad("nadar");
          disciplinaDecorator.accion(disciplina);
    }
    
}
