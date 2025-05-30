package br.com.fiap.rm_552407.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "desastre")
public class Desastre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Column(name = "data_desastre")
    private LocalDateTime dataDesastre;

    @Column(name = "localizacao")
    private String localizacao;

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
