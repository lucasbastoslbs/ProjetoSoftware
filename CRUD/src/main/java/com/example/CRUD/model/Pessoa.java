package com.example.CRUD.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity // informar JPA que é uma entidade do banco
public class Pessoa {
    @Id //JPA: identificador da tabela Pessoa (pk)
    @GeneratedValue(strategy = GenerationType.AUTO) //auto_increment
    private Integer id;
    //padrao se nao colocar nada nas outras colunas strings é varchar(255)
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(length = 15)
    private String fone;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    public Pessoa(String nome, String email, String fone) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
