package com.example.demo.services;

import com.example.demo.modelo.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.Optional;

// A forma de trabalhar com Services é para gerar maior organização no projeto.

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findBynome(String nome){
        return userRepository.findBynome(nome);
    }

    public Optional<User> findAwardByid(int id){
        return userRepository.findByid(id);
    }

    @Transactional //A Anotação Transactional serve para conectar e interagir com o banco.
    public User addAward(User prize){
        return userRepository.save(prize);
    }

    @Transactional
    public void deleteAward(User prize){
        userRepository.delete(prize);
    }

    public User updateAward(User prize){
        return userRepository.save(prize);
    }


}
