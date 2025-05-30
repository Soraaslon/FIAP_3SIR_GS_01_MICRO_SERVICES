package br.com.fiap.rm_552407.dto;

import java.time.LocalDateTime;

public class DesastreDTO {
    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime dataDesastre;
    private String localizacao;

    public DesastreDTO() {
    }

    public DesastreDTO(Long id, String nome, String descricao, LocalDateTime dataDesastre, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataDesastre = dataDesastre;
        this.localizacao = localizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataDesastre() {
        return dataDesastre;
    }

    public void setDataDesastre(LocalDateTime dataDesastre) {
        this.dataDesastre = dataDesastre;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
