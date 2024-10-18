package com.example.contrasena.controller;

import com.example.contrasena.model.Persona;
import com.example.contrasena.repository.CorreoRepository;
import com.example.contrasena.repository.RepositorotyContrasena;
import com.example.contrasena.service.CorreoService;
import com.example.contrasena.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private RepositorotyContrasena repository;

    @GetMapping("/datos")
    public List<Persona> obtenerPersona() {
        return repository.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarRegistro(@PathVariable Long id) {
        Optional<Persona> delete = repository.findById(id);

        if (delete.isPresent()) {
            repository.delete(delete.get());
            return "Usuario eliminado";
        } else {
            return "Registro no encontrado";
        }
    }

    @PostMapping("/guardar")
    public String guardarRegistro(@RequestBody Persona p) {
        String result = repository.validar_contrasena(p.getContrasena());

        if (result.equalsIgnoreCase("La contraseña es válida.")) {
            repository.save(p);
        }

        return result;
    }

    @PatchMapping("/editar/{id}")
    public String editarRegistro(@PathVariable Long id, @RequestBody Persona p) {
        Optional<Persona> persona = repository.findById(id);

        if (persona.isPresent()) {
            Persona personaExistente = persona.get();
            personaExistente.setUsuario(p.getUsuario());

            String result = repository.validar_contrasena(p.getContrasena());

            if (result.equalsIgnoreCase("La contraseña es válida.")) {
                personaExistente.setContrasena(p.getContrasena());
            } else {
                return result;
            }

            repository.save(personaExistente);
            return "Persona editada";
        } else {
            return "Persona no encontrada";
        }
    }
}


