package com.dev4abyss.hruser.resources;

import com.dev4abyss.hruser.entities.User;
import com.dev4abyss.hruser.services.UserService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/users")
@Api(tags = "Users", value = "Users")
@RequiredArgsConstructor
@RestController
public class UserResource {

    private final UserService service;

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam("email") String email) {
        return ResponseEntity.ok(service.findByEmail(email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
