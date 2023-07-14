package com.example.lookup.Controller;

import com.example.lookup.Entity.curso;
import com.example.lookup.Service.claseserviciocurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Cursos")
public class ControladorCursos {


      @Autowired
      private claseserviciocurso csc;

      @GetMapping
      @RequestMapping(value = "ConsultarCursos", method = RequestMethod.GET)
      public ResponseEntity<?> ConsultarCursos(){
          List<curso> cursoList=this.csc.ConsultarCursos();
            return ResponseEntity.ok(cursoList);
      }
      @PostMapping
      @RequestMapping(value = "CrearCurso", method = RequestMethod.POST)
      public ResponseEntity<?> CrearCurso (@RequestBody curso Curso){
          curso cursoCrear=this.csc.CrearCurso(Curso);
          return ResponseEntity.status(HttpStatus.CREATED).body(cursoCrear);
      }

      @PutMapping
      @RequestMapping(value ="ModificarCurso",method = RequestMethod.PUT)
      public ResponseEntity<?>ModificarCurso(@RequestBody curso Curso){
          curso cursoModificado=this.csc.ModificarCurso(Curso);
          return ResponseEntity.status(HttpStatus.CREATED).body(cursoModificado);
      }
      @GetMapping
      @RequestMapping(value = "BurcarCurso/{id}", method = RequestMethod.GET)
      public ResponseEntity<?> BurcarCurso(@PathVariable int id){
          curso Curso=this.csc.BuscarCurso(id);
          return ResponseEntity.ok(Curso);
      }

      @DeleteMapping
      @RequestMapping(value = "EliminarCurso/{id}", method = RequestMethod.DELETE)
        public ResponseEntity<?>EliminarCurso(@PathVariable int id){
          this.csc.EliminarCurso(id);
          return ResponseEntity.ok().build();
      }
  }
