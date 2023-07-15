package com.example.lookup.Controller;

import com.example.lookup.Entity.estado;
import com.example.lookup.Service.claseservicioestado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Estados")
public class ControladorEstados {
    @Autowired
    private claseservicioestado cse;
    @GetMapping
    @RequestMapping(value = "ConsultarEstados", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEstados(){
        List<estado> estadoList=this.cse.ConsultarEstados();
        return ResponseEntity.ok(estadoList);
    }
    @PostMapping
    @RequestMapping(value = "CrearEstados", method = RequestMethod.POST)
    public ResponseEntity<?>CrearEstados(@RequestBody estado estado){
        estado estadoCrear=this.cse.CrearEstados(estado);
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoCrear);
    }
    @PutMapping
    @RequestMapping(value = "ModificarEstados", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEstados(@RequestBody estado estado){
        estado estadoModificado=this.cse.ModificarEstados(estado);
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoModificado);
    }
    @GetMapping
    @RequestMapping(value ="BuscarEstados/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEstados(@PathVariable int id){
        estado estado=this.cse.BuscarEstados(id);
        return ResponseEntity.ok(estado);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarEstados/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarEstados(@PathVariable int id){
        this.cse.EliminarEstados(id);
        return ResponseEntity.ok().build();
    }
}
