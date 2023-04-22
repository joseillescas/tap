package com.msvusuarios.msvusuarios.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @NotNull
    @Column(nullable = false)
    private String nombre;

    @NotEmpty
    @Email
    @NotNull
    @Column(unique = true)
    private String email;

    @NotEmpty
    @NotNull
    @Column(nullable = false)
    private String password;

}
