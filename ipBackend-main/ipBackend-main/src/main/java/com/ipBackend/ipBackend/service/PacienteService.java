package com.ipBackend.ipBackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipBackend.ipBackend.entity.Paciente;
import com.ipBackend.ipBackend.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> obtenerPacientes(){
        return (ArrayList<Paciente>) pacienteRepository.findAll();
    }

    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> obtenerPacientePorId(Long id){
        return pacienteRepository.findById(id);
    }

    public boolean eliminarPaciente(Long id){
        try {
            pacienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
