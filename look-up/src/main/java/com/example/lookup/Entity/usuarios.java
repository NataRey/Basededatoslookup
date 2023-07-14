package com.example.lookup.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Usuarios")

public class usuarios {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//nos ayuda a crear las identificaciones
//id_usuario, nombre, apellido, telefono, correo_electrónico, contrasena
    @Column(name = "id_usuario")
    private int id_usuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo_electrónico")
    private String correo_electrónico;

    @Column(name ="contrasena")
    private String contrasena;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electrónico() {
        return correo_electrónico;
    }

    public void setCorreo_electrónico(String correo_electrónico) {
        this.correo_electrónico = correo_electrónico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
