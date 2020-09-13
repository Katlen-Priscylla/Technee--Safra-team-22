
package io.spring.G22.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.spring.G22.entity.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String> {

    Perfil findByNome(String nome);

}
