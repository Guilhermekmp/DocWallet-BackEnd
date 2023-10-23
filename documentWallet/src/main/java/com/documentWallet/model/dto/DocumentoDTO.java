package com.documentWallet.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentoDTO {

    @NotNull
    private Map<String, String> informacoes;

    @NotNull
    private byte fotoFrente;

    @NotNull
    private byte fotoVerso;

    @NotNull
    private Instant timeStamp;

}
