package com.ipBackend.ipBackend.controller;

// Crear API


// Codigo

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipBackend.ipBackend.entity.Cita;
import com.ipBackend.ipBackend.repository.CitaRepository;
import com.ipBackend.ipBackend.service.CitaService;

@CrossOrigin
@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    CitaService citaService;

    @GetMapping()
    public List<Cita> obtenerCitas(){
        return citaService.obtenerCitas();
    }

    @PostMapping()
    public Cita guardarCita(@RequestBody Cita cita){
        return this.citaService.guardarCita(cita);
    }

    @GetMapping(path = "/{id}")
    public Optional<Cita> obtenerCitaPorId(@PathVariable("id") Long id){
        return this.citaService.obtenerCitaPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok=this.citaService.eliminarCita(id);
        if(ok){
            return "Se eliminó la cita con id: "+ id;
        }else{
            return "No se pudo encontrar la cita con id: "+ id;
        }
    }
}
