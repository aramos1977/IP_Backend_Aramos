package com.ipBackend.ipBackend.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "Especialidad")
public class Especialidad {

    @Id
    @Column(unique = true)
    private int id_especialidad;
    private String nombre;
    @JsonIgnore
    @OneToMany(mappedBy = "especialidad")
    private List<Medico> medicos;

    public Especialidad(){

    }
    public Especialidad(int id_especialidad,String nombre) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
