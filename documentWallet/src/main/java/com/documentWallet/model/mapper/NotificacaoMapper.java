package com.documentWallet.model.mapper;

import com.documentWallet.model.dto.NotificacaoDTO;
import com.documentWallet.model.dto.UsuarioDTO;
import com.documentWallet.model.entity.NotificacaoEntity;
import com.documentWallet.model.entity.UsuarioEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificacaoMapper {

    NotificacaoDTO toDto(NotificacaoEntity notificacao);
    NotificacaoEntity toEntity(NotificacaoDTO notificacaoDTO);
}
