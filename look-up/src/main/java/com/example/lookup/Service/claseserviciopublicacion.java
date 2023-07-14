package com.example.lookup.Service;

import com.example.lookup.Entity.publicaciones;
import com.example.lookup.Repository.Publicacionrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class claseserviciopublicacion implements Publicacionservice {

    @Autowired
    private Publicacionrepo repoPu;

    @Override
    public List<publicaciones> ConsultarPublicaciones() {

        return (List<publicaciones>) this.repoPu.findAll();
    }

    @Override
    public publicaciones CrearPublicaciones(publicaciones publicaciones) {

        return this.repoPu.save(publicaciones);
    }
    @Override
    public publicaciones ModificarPublicaciones(publicaciones publicaciones){
        return this.repoPu.save(publicaciones);
    }

    @Override
    public publicaciones BuscarPublicaciones(int id) {

        return this.repoPu.findById(id).get();
    }

    @Override
    public void EliminarPublicacion(int id) {
        this.repoPu.deleteById(id);
    }
}