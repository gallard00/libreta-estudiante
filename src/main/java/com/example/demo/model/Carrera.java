package com.example.demo.model;

public class Carrera {
    private Long IdCarrera;
    private String nombre;

    public Carrera(Long idCarrera, String nombre) {
        IdCarrera = idCarrera;
        this.nombre = nombre;
    }

    public Long getIdCarrera() {
        return IdCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        IdCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}