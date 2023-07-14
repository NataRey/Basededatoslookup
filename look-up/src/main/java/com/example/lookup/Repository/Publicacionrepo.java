package com.example.lookup.Repository;

import com.example.lookup.Entity.publicaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Publicacionrepo extends CrudRepository<publicaciones, Integer> {
}
