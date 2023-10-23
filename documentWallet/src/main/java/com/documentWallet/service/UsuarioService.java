package com.documentWallet.service;

import com.documentWallet.model.dto.UsuarioDTO;
import com.documentWallet.model.entity.UsuarioEntity;
import com.documentWallet.model.mapper.UsuarioMapper;
import com.documentWallet.repository.UsuarioRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZonedDateTime;

@Service
@Log4j2
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Autowired
    private  UsuarioMapper mapper;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper mapper) {
        this.usuarioRepository = usuarioRepository;
        this.mapper = mapper;
    }

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO){
        String texto = Instant.now().toString();
        UsuarioEntity teste = mapper.toEntity(usuarioDTO);
        UsuarioEntity usuario = usuarioRepository.save(teste);
        return mapper.toDto(usuario);
    }

    public UsuarioDTO buscarUsuario(String id){
        UsuarioEntity usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi encontrado o usuário em questão com o id: " + id));
        return mapper.toDto(usuario);
    }
    public UsuarioDTO atualizarUsuario(String id, UsuarioDTO usuarioDTO) {
        buscarUsuario(id);
        return salvarUsuario(usuarioDTO);
    }
}
