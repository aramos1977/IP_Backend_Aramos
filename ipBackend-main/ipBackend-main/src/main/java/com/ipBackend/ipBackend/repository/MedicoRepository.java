package com.ipBackend.ipBackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipBackend.ipBackend.entity.Medico;

@RepositoryRestResource(collectionResourceRel = "medicos", path = "medicos")
public interface MedicoRepository extends PagingAndSortingRepository<Medico , Long>, CrudRepository<Medico , Long> {

}
