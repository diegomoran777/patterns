package com.interfaces.interfaces_2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    
    private String descripcion;
    private List<String> actividades;

    public Disciplina(String descripcion) {
        this.descripcion = descripcion;
        this.actividades = new ArrayList<String>();
    }

    public Disciplina() {

    }
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getActividades() {
        return actividades;
    }

    public void addActividad(String actividad) {
        this.actividades.add(actividad);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDeportes(List<String> deportes) {
        this.actividades = deportes;
    }
}
