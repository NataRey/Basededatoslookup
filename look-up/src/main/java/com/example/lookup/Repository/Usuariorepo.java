package com.example.lookup.Repository;

import com.example.lookup.Entity.usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuariorepo extends CrudRepository<usuarios, Integer> {

}
