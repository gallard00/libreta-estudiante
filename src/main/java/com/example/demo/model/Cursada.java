package com.example.demo.model;

public class Cursada {
    private Long IdCursada;
    private Long IdMateria;
    private String condicion;
    private Boolean aprobado;

    public Long getIdCursada() {
        return IdCursada;
    }

    public void setIdCursada(Long idCursada) {
        IdCursada = idCursada;
    }

    public Long getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(Long idMateria) {
        IdMateria = idMateria;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }
}