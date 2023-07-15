package com.example.lookup.Service;

import com.example.lookup.Entity.estado;
import com.example.lookup.Repository.Estadorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class claseservicioestado implements Estadoservice {

@Autowired
private Estadorepo repoes;
    @Override
    public List<estado> ConsultarEstados() {
        return (List<estado>) this.repoes.findAll();
    }

    @Override
    public estado CrearEstados(estado estado) {
        estado.setNombre_estado(estado.getNombre_estado());
        return this.repoes.save(estado);
    }

    @Override
    public estado ModificarEstados(estado estado) {
        return this.repoes.save(estado);
    }

    @Override
    public estado BuscarEstados(int id) {
        return this.repoes.findById(id).get();
    }

    @Override
    public void EliminarEstados(int id) {
        this.repoes.deleteById(id);
    }
}
