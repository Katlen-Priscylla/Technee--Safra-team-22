
package io.spring.G22.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import io.spring.G22.entity.Usuario;


public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    List<Usuario> findByNomeLikeIgnoreCase(String nome);
    
    Usuario findByEmail(String email);
}
