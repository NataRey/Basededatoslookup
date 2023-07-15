package com.example.lookup.Repository;


import com.example.lookup.Entity.estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estadorepo extends CrudRepository<estado, Integer> {

}
