package com.documentWallet.controller;

import com.documentWallet.model.dto.UsuarioDTO;
import com.documentWallet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "usuario")
public class UsuarioController {

    @Autowired
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> salvarUsuario(@RequestBody UsuarioDTO usuarioDTO){

        return ResponseEntity.ok().body(usuarioService.salvarUsuario(usuarioDTO));
    }

    @GetMapping("{id}")
    public ResponseEntity<UsuarioDTO> buscarUsuario(@PathVariable Long id){

        return ResponseEntity.ok().body(usuarioService.buscarUsuario(id.toString()));
    }


    @PutMapping("{id}")
    public ResponseEntity<UsuarioDTO> atualizarUsuario(@PathVariable Long id,@RequestBody UsuarioDTO usuarioDTO){

        return ResponseEntity.ok().body(usuarioService.atualizarUsuario(id.toString(),usuarioDTO));
    }
}
