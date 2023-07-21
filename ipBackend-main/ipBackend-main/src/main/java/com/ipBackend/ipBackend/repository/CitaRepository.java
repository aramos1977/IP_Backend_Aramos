package com.ipBackend.ipBackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ipBackend.ipBackend.entity.Cita;

@RepositoryRestResource(collectionResourceRel = "citas", path = "citas")
public interface CitaRepository extends PagingAndSortingRepository<Cita , Long>, CrudRepository<Cita , Long> {

}
