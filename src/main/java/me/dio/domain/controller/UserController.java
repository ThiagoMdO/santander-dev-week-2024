package me.dio.domain.controller;

import lombok.RequiredArgsConstructor;
import me.dio.domain.model.entites.User;
import me.dio.domain.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> encontrarUsuarioPorId(@PathVariable Long id){
        User user = userService.findUserByID(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<User> criarUsuario(@RequestBody User userRequest){
        User user = userService.createUser(userRequest);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(user);
    }

}
