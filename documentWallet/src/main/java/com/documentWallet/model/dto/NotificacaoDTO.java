package com.documentWallet.model.dto;

import com.documentWallet.model.enums.TipoNotificacaoEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificacaoDTO {

    @NotNull
    private String id;

    @NotEmpty
    private String mensagem;

    @NotNull
    private Instant timeStamp;

    @NotNull
    private TipoNotificacaoEnum tipoNotificacao;

    private List<Long> idsUsuarios;
}
