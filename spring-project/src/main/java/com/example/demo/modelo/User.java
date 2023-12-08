package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import java.util.UUID;

/*
    As entidades são nossas tabelas no banco de dados, chamadas tambem de objetos, tudo que tem aqui é
criado da mesma forma em nosso banco.
*/


@Entity //Mostra ao SPRING que é uma tabela
@Table(schema = "user") //Da nome a uma tabela ou utiliza uma table existente, caso seja existente todos os campos - devem ser identicos (classe e tabela)
public class User {

    @Id //NECESSÁRIO MARCAR COMO ID (CHAVE PRIMARIA)
    //@GeneratedValue(strategy = GenerationType.AUTO) //GERADOR AUTOMATICO DE ID
    private int id;

    private String nome;

    private String senha;



    public int getId() { return id; }

    public void setId(int id) { this.id = id; }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

}
