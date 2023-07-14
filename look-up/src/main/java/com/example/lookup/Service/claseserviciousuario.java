package com.example.lookup.Service;

import com.example.lookup.Entity.usuarios;
import com.example.lookup.Repository.Usuariorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class claseserviciousuario implements Usuarioservice {
    @Autowired

    private Usuariorepo repo;

    @Override
    public List<usuarios> ConsultarUsuarios() {
        return (List<usuarios>)
                this.repo.findAll();//findAll traigo todos los datos del repo
    }
    @Override
    public usuarios CrearUsuarios(usuarios usuarios){
        usuarios.setNombre(usuarios.getNombre());
        return this.repo.save(usuarios);
    }

    @Override
    public usuarios ModificarUsuarios(usuarios usuarios) {
        return this.repo.save(usuarios);
    }

    @Override
    public usuarios BuscarUsuarios(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarUsuarios(int id) {
        this.repo.deleteById(id);

    }

}
