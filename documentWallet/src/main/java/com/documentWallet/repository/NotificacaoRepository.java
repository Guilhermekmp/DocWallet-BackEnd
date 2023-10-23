package com.documentWallet.repository;

import com.documentWallet.model.entity.NotificacaoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacaoRepository extends MongoRepository<NotificacaoEntity, String> {
}
