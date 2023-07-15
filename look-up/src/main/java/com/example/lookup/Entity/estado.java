package com.example.lookup.Entity;

import jakarta.persistence.*;

@Entity
@Table(name= "estado")
public class estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //    id_estado, nombre_estado
    @Column(name = "id_estado")
    private int id_estado;

    @Column(name = "nombre_estado")
    private String nombre_estado;

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getNombre_estado() {
        return nombre_estado;
    }

    public void setNombre_estado(String nombre_estado) {
        this.nombre_estado = nombre_estado;
    }
}
