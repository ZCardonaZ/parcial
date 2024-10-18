package com.example.contrasena.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CorreoRepositoryImpl implements CorreoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String validarCorreo(String correo) {
        String sql = "SELECT validar_correo(?) FROM dual";
        return jdbcTemplate.queryForObject(sql, new Object[]{correo}, String.class);
    }
}

