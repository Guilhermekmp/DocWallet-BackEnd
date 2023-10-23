package com.documentWallet.model.entity;

import com.documentWallet.model.Documento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "usuario")
@Builder
public class UsuarioEntity {

    @Id
    private String id;

    private String nome;

    private String email;

    private Map<String, Documento> documentos;

    private Instant timeStamp;
}
