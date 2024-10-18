package com.example.contrasena.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NumeroRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String esMultiploDe3(int numero) {
        String sql = "SELECT es_multiplo_de_3(?) FROM dual";
        return jdbcTemplate.queryForObject(sql, new Object[]{numero}, String.class);
    }
}
