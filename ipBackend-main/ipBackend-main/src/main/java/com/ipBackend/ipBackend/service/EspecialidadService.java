package com.ipBackend.ipBackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipBackend.ipBackend.entity.Especialidad;
import com.ipBackend.ipBackend.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
    @Autowired
    EspecialidadRepository especialidadRepository;

    public List<Especialidad> obtenerEspecialidades(){
        return (ArrayList<Especialidad>) especialidadRepository.findAll();
    }

    public Optional<Especialidad> obtenerEspecialidadPorId(Long id){
        return especialidadRepository.findById(id);
    }
}
