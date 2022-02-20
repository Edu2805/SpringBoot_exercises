package com.devInHouse.simpleForm.controllers;

import com.devInHouse.simpleForm.entities.User;
import com.devInHouse.simpleForm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Criando um Rest controller
//Definindo o caminho da url para acesso

@RestController
@RequestMapping(value = "/users")
public class UserController {

    //Fazendo a injeção de dependências com o Autowired (verificar...)
    @Autowired
    private UserRepository repository;

    //criando um end-point para buscar todos os usuários listados no banco com o GetMapping
    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    //Criando um end-point para buscar os usuários pelo id, o PathVariable casa o value do argumento
    // do GetMapping com o Long id do método
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return result;
    }

    //Criando um end-point para salvar um novo usuário usando o PostMapping
    //O método vai inserir somente o corpo do body @RequestBody, não vai inserir o Id, pois o mesmo é gerado
    //automaticamente pelo banco
    @PostMapping
    public User insert(@RequestBody User user){

        // o save vai enviar para o banco de dados já convertido para relacional
        User result = repository.save(user);
        return result;
    }
}
