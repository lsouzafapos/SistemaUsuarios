package br.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
