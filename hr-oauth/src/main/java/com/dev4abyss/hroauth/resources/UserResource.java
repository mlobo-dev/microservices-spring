package com.dev4abyss.hroauth.resources;

import com.dev4abyss.hroauth.entities.User;
import com.dev4abyss.hroauth.exception.ObjectNotFoundException;
import com.dev4abyss.hroauth.services.UserService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/users")
@Api(tags = "Users", value = "Users")
@RequiredArgsConstructor
@RestController
public class UserResource {

    private final UserService service;

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam("email") String email) {
        try {
            return ResponseEntity.ok(service.findByEmail(email));

        } catch (ObjectNotFoundException e) {
            return ResponseEntity.notFound().build();
        }

    }

}
