package com.ipBackend.ipBackend.entity;

import java.time.LocalDate;


import jakarta.persistence.*;

@Entity
@Table(name = "Cita")
public class Cita {

    @Id
    @Column(unique = true)
    private int id_cita;
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "tarjeta_profesional")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "cedula")
    private Paciente paciente;

    //TO DO:Falta arreglar que aparezca cc y tp en vez de paciente y médico
    public Cita(){

    }

    public Cita(int id_cita,LocalDate fecha,Paciente paciente, Medico medico) {
        this.id_cita = id_cita;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
