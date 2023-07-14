package com.example.lookup.Controller;
import com.example.lookup.Entity.publicaciones;
import com.example.lookup.Service.claseserviciopublicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("Publicaciones")
public class ControladorPublicaciones {

    @Autowired
    private claseserviciopublicacion csp;

    @GetMapping
    @RequestMapping(value = "ConsultarPublicaciones", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPublicaciones(){
        List<publicaciones> publicacionesList=this.csp.ConsultarPublicaciones();
        return ResponseEntity.ok(publicacionesList);
    }

    @PostMapping
    @RequestMapping(value = "CrearPublicaciones", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPublicaciones(@RequestBody publicaciones publicaciones){
        publicaciones publicacionesCrear=this.csp.CrearPublicaciones(publicaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(publicacionesCrear);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPublicaciones",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPublicaciones(@RequestBody publicaciones publicaciones){
        publicaciones publicacionesModificar=this.csp.ModificarPublicaciones(publicaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(publicacionesModificar);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPublicaciones/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPublicaciones(@PathVariable int id){
        publicaciones publicacionesBuscar=this.csp.BuscarPublicaciones(id);
        return ResponseEntity.ok(publicacionesBuscar);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPublicaciones/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarPublicaciones(@PathVariable int id){
        this.csp.EliminarPublicacion(id);
        return ResponseEntity.ok().build();
    }
}
