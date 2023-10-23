package com.documentWallet.model.dto;

import com.documentWallet.model.Documento;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    @NotNull
    @JsonProperty("id")
    private String id;

    @NotBlank
    @Size(max = 256)
    @JsonProperty("nome")
    private String nome;

    @Email
    @JsonProperty("email")
    private String email;

    @JsonProperty("documentos")
    private Map<String, Documento> documentos;

    @NotNull
    @JsonProperty("timeStamp")
    private Instant timeStamp;
}
