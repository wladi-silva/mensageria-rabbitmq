package com.wladi.email.models;

import jakarta.validation.constraints.NotBlank;

public class EmailModel {

    @NotBlank
    private String emailDe;
    @NotBlank
    private String emailPara;
    @NotBlank
    private String titulo;
    @NotBlank
    private String conteudo;

    private String status;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getEmailDe() {
        return emailDe;
    }
    public void setEmailDe(String emailDe) {
        this.emailDe = emailDe;
    }
    public String getEmailPara() {
        return emailPara;
    }
    public void setEmailPara(String emailPara) {
        this.emailPara = emailPara;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}