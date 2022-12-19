package br.com.userdept.controller;

import br.com.userdept.entities.User;
import br.com.userdept.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired // Mecanismo de injeção de dependência.
    private UsersRepository repository;

    // Criando um EndPoint com função de buscar os dados no banco User.
    @GetMapping // Indica que o verbo HTTP é o GET.
    public List<User> findAll() {
        return repository.findAll();
    }


    @GetMapping(value = "/{id}") // indicando o caminho /users/1(id)
    public User findBuId(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping  // Confirando o metodo para receber POST
    public User insert(@RequestBody User user ) {  //Indica que oque sera inserido vai ser o corpo de requisição
        return repository.save(user);
    }
}
