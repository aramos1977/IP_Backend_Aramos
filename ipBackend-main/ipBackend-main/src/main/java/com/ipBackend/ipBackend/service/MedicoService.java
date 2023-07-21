package com.ipBackend.ipBackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipBackend.ipBackend.entity.Medico;
import com.ipBackend.ipBackend.repository.MedicoRepository;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository medicoRepository;

    public List<Medico> obtenerMedicos(){
        return (ArrayList<Medico>) medicoRepository.findAll();
    }

    public Medico guardarMedico(Medico medico){
        return medicoRepository.save(medico);
    }

    public Optional<Medico> obtenerMedicoPorId(Long id){
        return medicoRepository.findById(id);
    }

    public boolean eliminarMedico(Long id){
        try {
            medicoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
