package com.dev4abyss.hroauth.services;

import com.dev4abyss.hroauth.entities.User;
import com.dev4abyss.hroauth.exception.ObjectNotFoundException;
import com.dev4abyss.hroauth.exception.OperationException;
import com.dev4abyss.hroauth.feigns.UserFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

    private final UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        try {

            User user = userFeignClient.findById(email).getBody();
            if (user == null) {
                log.error("email not found: " + email);
                throw new ObjectNotFoundException("User not found by email: " + email);
            }
            log.info("Email found: " + email);
            return user;
        } catch (Exception e) {
            throw new OperationException("failed to recover user", e);
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userFeignClient.findById(username).getBody();
        if (user == null) {
            log.error("email not found: " + username);
            throw new UsernameNotFoundException("User not found by email: " + username);
        }
        log.info("Email found: " + username);
        return user;

    }
}
