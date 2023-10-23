package com.documentWallet.model.enums;

public enum TipoNotificacaoEnum {

    PRIVADO("PRIVADO"),
    MANUTENCAO("MANUTENCAO"),
    ERRO("ERRO");

    private String value;

    TipoNotificacaoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
