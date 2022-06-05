package com.interfaces.interfaces_2;

public class Main {
    

    public static void main(String[] args) {

        Disciplina disciplina = new Disciplina("Deportivas");

        IDisciplina triatlon = new Triatlon();

        IDisciplina triatlonDecorado = new Ciclismo(new Maraton(new Natacion(triatlon)));

        triatlonDecorado.accion(disciplina);
    }
}
