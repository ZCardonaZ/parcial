package com.example.contrasena.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface CorreoRepository {

    String validarCorreo(String correo);

}