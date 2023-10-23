package com.documentWallet.controller;

import com.documentWallet.model.dto.NotificacaoDTO;
import com.documentWallet.service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("notificacao")
public class NotificacaoController {

    @Autowired
    private NotificacaoService notificacaoService;

    public NotificacaoController(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    @PostMapping
    public ResponseEntity<NotificacaoDTO> salvarNotificacao(@RequestBody NotificacaoDTO notificacaoDTO){
        return ResponseEntity.ok().body(notificacaoService.salvarNotificacao(notificacaoDTO));
    }

    @GetMapping
    public ResponseEntity<Object> buscarNotificacao(){
        return ResponseEntity.ok().body(new Object());
    }
}
