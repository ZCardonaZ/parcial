package com.example.contrasena.service;

import com.example.contrasena.repository.CorreoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

    @Autowired
    private CorreoRepository correoRepository;

    public String validarCorreo(String correo) {
        return correoRepository.validarCorreo(correo);
    }
}