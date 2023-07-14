package com.example.lookup.Service;

import com.example.lookup.Entity.usuarios;

import java.util.List;

public interface Usuarioservice {

    public List<usuarios> ConsultarUsuarios();

    public usuarios CrearUsuarios (usuarios usuarios);

    public usuarios ModificarUsuarios (usuarios usuarios);

    public usuarios BuscarUsuarios (int id);

    public void EliminarUsuarios (int id);

}
