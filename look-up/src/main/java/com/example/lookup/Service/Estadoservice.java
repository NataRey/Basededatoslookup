package com.example.lookup.Service;

import com.example.lookup.Entity.estado;

import java.util.List;

public interface Estadoservice {

    public List<estado> ConsultarEstados();
    public estado CrearEstados(estado estado);
    public estado ModificarEstados(estado estado);
    public estado BuscarEstados(int id);
    public void EliminarEstados(int id);

}
