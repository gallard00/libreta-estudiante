package com.example.demo.model;

public class Estudiante {
    private Long IdEstudiante;
    private Long IdPersona;
    private Integer legajo;

    public Long getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        IdEstudiante = idEstudiante;
    }

    public Long getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(Long idPersona) {
        IdPersona = idPersona;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}