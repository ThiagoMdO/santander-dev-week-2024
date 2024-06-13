package me.dio.domain.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.domain.model.entites.User;
import me.dio.domain.repository.UserRepository;
import me.dio.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findUserByID(Long id) {
        User user = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return user;
    }

    @Override
    public User createUser(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber()))
            throw new IllegalArgumentException("Conflict, This Account Number already exists");

        return userRepository.save(user);
    }

}
