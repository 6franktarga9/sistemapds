package net.apps.rsapp.repository;

import net.apps.rsapp.entity.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
