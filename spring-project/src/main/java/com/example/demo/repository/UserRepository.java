package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository; //Vivo
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.User;

import java.util.Optional;
import java.util.UUID;

    /*
        Classe responsavel por se comunicar com o banco de dados: SALVAR, LER, ATUALIZAR E DELETAR
    */

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    /*
    A CLASSE DEVE SER ESCRITA DESSA MESMA FORMA E ESSA CLASSE JA POSSUI METODOS EXISTENTES MAS CASO VOCE
    QUEIRA CRIAR ALGO ESPECIFICO BASTA FAZER IGUAL A LINHA 24 SEGUE DOCUMENTAÇÃO DE APOIO
    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
     */
    Optional<User> findBynome(String nome);

    Optional<User> findByid(int id);


}
