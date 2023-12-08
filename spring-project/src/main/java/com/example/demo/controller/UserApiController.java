package com.example.demo.controller;

import com.example.demo.repository.UserRepository;
import com.example.demo.modelo.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserApiController {

    @Autowired
    private UserService empServices;

    @Autowired
    UserRepository empBd;

    @CrossOrigin
    @PostMapping(value = "/create", produces = "application/json")
    public User create(@RequestBody User example){
        empBd.save(example);
        return example;
    }

    @CrossOrigin
    @GetMapping("/list")
    public List<User> findAllRecords(){
        return empBd.findAll();
    }

    @RequestMapping(value = "search/nome/{nome}", method = RequestMethod.GET)
    public Optional<User> searchBynome(@PathVariable String nome) {
        return empBd.findBynome(nome);
    }

    @RequestMapping(value = "search/id/{id}", method = RequestMethod.GET)
    public Optional<User> searchById(@PathVariable int id) {
        return empBd.findByid(id);
    }

    @CrossOrigin
    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity<String> login(@RequestBody User loginRequest) {
        Optional<User> userOptional = empBd.findBynome(loginRequest.getNome());

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getSenha().equals(loginRequest.getSenha())) {
                // Credenciais válidas, redireciona para outra página ou retorna sucesso
                return ResponseEntity.ok("{\"message\": \"Login bem-sucedido\", \"usuario\": \"" + user.getNome() + "\"}");
            } else {
                // Senha incorreta
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\": \"Senha incorreta\"}");
            }
        } else {
            // Usuário não encontrado
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\": \"Usuário não encontrado\"}");
        }
    }

    @PutMapping("/update/id/{id}")
    public User updateById(@PathVariable int id, @RequestBody User movie) {
        User user = empBd.findByid(id).get();
        user.setNome(movie.getNome());
        user.setSenha(movie.getSenha());
        empBd.save(user);
        return user;
    }

    @DeleteMapping("/delete/id/{id}")
    public String deleteById(@PathVariable int id) {
        User emp = empBd.findByid(id).get();
        empBd.delete(emp);
        return "{deleted:"+id+"}";
    }
}
