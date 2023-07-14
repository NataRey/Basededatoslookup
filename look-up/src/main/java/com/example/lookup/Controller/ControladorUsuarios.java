package com.example.lookup.Controller;


import com.example.lookup.Entity.usuarios;
import com.example.lookup.Service.claseserviciousuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Usuarios")
public class ControladorUsuarios {

    @Autowired
    private claseserviciousuario csu;

    @GetMapping
    @RequestMapping(value = "ConsultarUsuarios",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarUsuarios(){
        List<usuarios> usuariosList=this.csu.ConsultarUsuarios();
        return ResponseEntity.ok(usuariosList);
    }
    @PostMapping
    @RequestMapping(value = "CrearUsuarios", method = RequestMethod.POST)
    public ResponseEntity<?> CrearUsuarios(@RequestBody usuarios usuarios){
        usuarios usuariosCrear=this.csu.CrearUsuarios(usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuariosCrear);
    }

    @PutMapping
    @RequestMapping(value = "ModificarUsuarios", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarUsuarios(@RequestBody usuarios usuarios){
        usuarios usuariosModificar=this.csu.ModificarUsuarios(usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuariosModificar);
    }
    @GetMapping
    @RequestMapping(value = "BuscarUsuarios/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarUsuarios(@PathVariable int id){
        usuarios usuariosBuscar=this.csu.BuscarUsuarios(id);
        return ResponseEntity.ok(usuariosBuscar);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarUsuarios/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarUsuarios(@PathVariable int id){
        this.csu.EliminarUsuarios(id);
        return ResponseEntity.ok().build();//.build hace que si se eliminan datos muestre la informacion actualizada
    }







}
