package com.ipBackend.ipBackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipBackend.ipBackend.entity.Cita;
import com.ipBackend.ipBackend.repository.CitaRepository;

@Service
public class CitaService {
    @Autowired
    CitaRepository citaRepository;

    public List<Cita> obtenerCitas(){
        return (ArrayList<Cita>) citaRepository.findAll();
    }

    public Cita guardarCita(Cita cita){
        return citaRepository.save(cita);
    }

    public Optional<Cita> obtenerCitaPorId(Long id){
        return citaRepository.findById(id);
    }

    public boolean eliminarCita(Long id){
        try {
            citaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
