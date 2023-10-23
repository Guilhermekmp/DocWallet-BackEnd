package com.documentWallet.service;

import com.documentWallet.model.dto.NotificacaoDTO;
import com.documentWallet.model.entity.NotificacaoEntity;
import com.documentWallet.model.mapper.NotificacaoMapper;
import com.documentWallet.model.mapper.NotificacaoMapper;
import com.documentWallet.repository.NotificacaoRepository;
import com.documentWallet.repository.NotificacaoRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class NotificacaoService {

    private final NotificacaoRepository notificacaoRepository;
    @Autowired
    private NotificacaoMapper mapper;

    public NotificacaoService(NotificacaoRepository notificacaoRepository, NotificacaoMapper mapper) {
        this.notificacaoRepository = notificacaoRepository;
        this.mapper = mapper;
    }

    public NotificacaoDTO salvarNotificacao(NotificacaoDTO notificacaoDTO){
        String texto = Instant.now().toString();
        NotificacaoEntity teste = mapper.toEntity(notificacaoDTO);
        NotificacaoEntity notificacao = notificacaoRepository.save(teste);
        return mapper.toDto(notificacao);
    }

    public NotificacaoDTO buscarNotificacao(String id){
        NotificacaoEntity notificacao = notificacaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi encontrado a notificação em questão com o id: " + id));
        return mapper.toDto(notificacao);
    }

}
