package com.example.lookup.Entity;

import jakarta.persistence.*;

@Entity
@Table(name= "curso")
public class curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id_curso, nombre_curso, descripcion, direccion
    @Column(name = "id_curso")
    private int id_usuario;

    @Column(name = "nombre_curso")
    private String nombre_curso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "direccion")
    private String direccion;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
