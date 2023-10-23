package com.documentWallet.model.entity;

import com.documentWallet.model.enums.TipoNotificacaoEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document(collection = "notificacao")
public class NotificacaoEntity {

    @Id
    private String id;

    @Field("Mensagem")
    private String mensagem;

    @Field("TimeStamp")
    private Instant timeStamp;

    @Field("TipoNotificacao")
    private TipoNotificacaoEnum tipoNotificacao;

    @Field("Usuarios")
    private List<Long> idsUsuarios;
}
