package com.dev4abyss.hruser.services;

import com.dev4abyss.hruser.entities.User;
import com.dev4abyss.hruser.exception.ObjectNotFoundException;
import com.dev4abyss.hruser.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository repository;


    public User findByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(() -> new ObjectNotFoundException("User not found by email: " + email));
    }
}
