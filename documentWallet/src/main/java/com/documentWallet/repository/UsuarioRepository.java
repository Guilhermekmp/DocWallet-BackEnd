package com.documentWallet.repository;

import com.documentWallet.model.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioEntity, String> {
}
