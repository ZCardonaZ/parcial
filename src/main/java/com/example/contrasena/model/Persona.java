package com.example.contrasena.model;


import jakarta.persistence.*;


@Entity
@Table(name = "taller_cuatro")
public class Persona {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String usuario;
    @Column
    private String contrasena;

    //Constructors

    public Persona(){}

    public Persona(Long id, String usuario, String contrasena) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Getters y Setters

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public String getContrasena() {return contrasena;}
    public void setContrasena(String contrasena) {this.contrasena = contrasena;}
}
