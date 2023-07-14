package com.example.lookup.Service;

import com.example.lookup.Entity.curso;

import java.util.List;

public interface Cursoservice {

    public List<curso> ConsultarCursos();
    public curso CrearCurso (curso Curso);
    public curso ModificarCurso (curso Curso);
    public curso BuscarCurso(int id);
    public void EliminarCurso(int id);



}
