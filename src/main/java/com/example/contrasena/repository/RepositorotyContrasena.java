package com.example.contrasena.repository;

import com.example.contrasena.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorotyContrasena extends JpaRepository<Persona, Long> {

    @Query(value = "SELECT validar_persona(:contrasena) FROM dual", nativeQuery = true)
    String validar_contrasena(String contrasena);

}
