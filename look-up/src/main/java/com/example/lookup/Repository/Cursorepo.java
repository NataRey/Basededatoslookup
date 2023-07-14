package com.example.lookup.Repository;

import com.example.lookup.Entity.curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cursorepo extends CrudRepository<curso, Integer> {

}
