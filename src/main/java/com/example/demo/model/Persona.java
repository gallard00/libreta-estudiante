package com.example.demo.model;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;

import javax.persistence.*;

@Table(name = "persona")
@Entity
public class Persona{
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long IdPersona;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    private String direccion;

    public Persona(Long idPersona, String nombre, String apellido, String dni, String telefono, String mail, String direccion) {
        IdPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
    }

    public Long getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(Long idPersona) {
        IdPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}