package com.example.lookup.Service;

import com.example.lookup.Entity.publicaciones;

import java.util.List;

public interface Publicacionservice {

    public List<publicaciones> ConsultarPublicaciones();

    public publicaciones CrearPublicaciones(publicaciones publicaciones);

    public publicaciones BuscarPublicaciones(int id);

    public publicaciones ModificarPublicaciones(publicaciones publicaciones);

    public void EliminarPublicacion (int id);
}
