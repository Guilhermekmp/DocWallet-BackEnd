package com.documentWallet.model;

import lombok.Data;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Map;

@Data
public class Documento {

    private Map<String, String> informacoes;
    private byte fotoFrente;
    private byte fotoVerso;
    private Instant timeStamp;

}
