package com.interfaces.interfaces_2;


public class Triatlon implements IDisciplina{

    @Override
    public void accion(Disciplina disciplina) {
            System.out.println("Triatlon contiene estas disciplinas: ");
            disciplina.getActividades().forEach(System.out::println);
    }


}
