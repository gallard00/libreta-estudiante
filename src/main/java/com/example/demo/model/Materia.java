package com.example.demo.model;

public class Materia {
    private Long IdMateria;
    private String nombre;
    private Integer año;
    private Long IdCarrera;
    private Long IdProfesor;

    public Long getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(Long idMateria) {
        IdMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Long getIdCarrera() {
        return IdCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        IdCarrera = idCarrera;
    }

    public Long getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        IdProfesor = idProfesor;
    }
}