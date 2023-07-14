package com.example.lookup.Service;

import com.example.lookup.Entity.curso;
import com.example.lookup.Repository.Cursorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class claseserviciocurso implements Cursoservice {
    @Autowired
    private Cursorepo repoCu;

    @Override
    public List<curso> ConsultarCursos(){
        return (List<curso>) this.repoCu.findAll();
    }
    @Override
    public curso CrearCurso (curso Curso){
        Curso.setNombre_curso(Curso.getNombre_curso());
        return this.repoCu.save(Curso);
    }
    @Override
    public curso ModificarCurso (curso Curso){
        return this.repoCu.save(Curso);
    }
    @Override
    public curso BuscarCurso(int id){
        return this.repoCu.findById(id).get();
    }
    public void EliminarCurso(int id){
        this.repoCu.deleteById(id);
    }
}
