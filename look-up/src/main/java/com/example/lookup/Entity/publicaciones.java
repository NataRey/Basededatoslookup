package com.example.lookup.Entity;

import jakarta.persistence.*;

import java.util.Date;

//id_publicacion, id_usuario, tipo, contenido, fecha_creacion
@Entity
@Table(name = "Publicaciones")
public class publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicacion")
    private int id_publicacion;

    @Column(name = "id_usuario")
    private int id_usuario;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    public int getId_publicacion() {
        return id_publicacion;
    }

    public void setId_publicacion(int id_publicacion) {
        this.id_publicacion = id_publicacion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
