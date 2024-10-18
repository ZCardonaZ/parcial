package com.example.contrasena.controller;

import com.example.contrasena.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/numeros")
public class NumeroController {

    @Autowired
    private NumeroService numeroService;

    @GetMapping("/es-multiplo-de-3")
    public ResponseEntity<String> validarMultiploDe3(@RequestParam int numero) {
        String resultado = numeroService.validarMultiploDe3(numero);
        return ResponseEntity.ok(resultado);
    }
}
