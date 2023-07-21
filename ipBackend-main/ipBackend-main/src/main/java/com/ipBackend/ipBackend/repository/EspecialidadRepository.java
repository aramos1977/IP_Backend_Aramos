package com.ipBackend.ipBackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipBackend.ipBackend.entity.Especialidad;

@RepositoryRestResource(collectionResourceRel = "especialidades", path = "especialidades")
public interface EspecialidadRepository extends PagingAndSortingRepository<Especialidad , Long>, CrudRepository<Especialidad , Long>{

}
