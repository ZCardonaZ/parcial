package com.example.contrasena.controller;

import com.example.contrasena.service.CorreoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/correo")
public class CorreoController {

    @Autowired
    private CorreoService correoService;

    @GetMapping("/validar")
    public ResponseEntity<String> validarCorreo(@RequestParam String correo) {
        String resultado = correoService.validarCorreo(correo);
        return ResponseEntity.ok(resultado);
    }
}
