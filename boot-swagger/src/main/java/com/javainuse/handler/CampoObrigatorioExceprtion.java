package com.javainuse.handler;

public class CampoObrigatorioExceprtion extends BusinessException {

    public CampoObrigatorioExceprtion(String campo) {
        super("O campo %s é obrigatório", campo);
        }


}
