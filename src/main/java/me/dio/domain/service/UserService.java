package me.dio.domain.service;

import me.dio.domain.model.entites.User;

public interface UserService {

    User findUserByID(Long id);

    User createUser(User user);
}
