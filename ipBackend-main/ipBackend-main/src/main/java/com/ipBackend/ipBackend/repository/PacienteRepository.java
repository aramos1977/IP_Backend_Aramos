package com.ipBackend.ipBackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipBackend.ipBackend.entity.Paciente;

@RepositoryRestResource(collectionResourceRel = "pacientes", path = "pacientes")
public interface PacienteRepository extends PagingAndSortingRepository<Paciente , Long>, CrudRepository<Paciente , Long>{
}
