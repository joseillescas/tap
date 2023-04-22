package com.msvusuarios.msvusuarios.repositories;

import com.msvusuarios.msvusuarios.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Usuariorepository extends CrudRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

}
