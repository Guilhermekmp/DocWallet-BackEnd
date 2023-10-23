package com.documentWallet.model.mapper;

import com.documentWallet.model.dto.UsuarioDTO;
import com.documentWallet.model.entity.UsuarioEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDTO toDto(UsuarioEntity usuario);
    UsuarioEntity toEntity(UsuarioDTO usuarioDTO);
}
