package com.example.demo.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "cursada")
@Entity
@Getter
@Setter
public class Cursada {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long IdCursada;
    private Long IdMateria;
    private String condicion;
    private Boolean aprobado;


}