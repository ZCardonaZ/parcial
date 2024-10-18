package com.example.contrasena.service;

import com.example.contrasena.repository.NumeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumeroService {

    @Autowired
    private NumeroRepository numeroRepository;

    public String validarMultiploDe3(int numero) {
        return numeroRepository.esMultiploDe3(numero);
    }
}
