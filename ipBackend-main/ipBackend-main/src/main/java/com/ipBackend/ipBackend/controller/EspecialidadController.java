package com.ipBackend.ipBackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipBackend.ipBackend.entity.Especialidad;
import com.ipBackend.ipBackend.service.EspecialidadService;

@CrossOrigin
@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
    @Autowired
    EspecialidadService especialidadService;

    @GetMapping()
    public List<Especialidad> obtenerEspecialidades(){
        return especialidadService.obtenerEspecialidades();
    }

    @GetMapping(path = "/{id}")
    public Optional<Especialidad> obtenerEspecialidadPorId(@PathVariable("id") Long id){
        return this.especialidadService.obtenerEspecialidadPorId(id);
    }
}
