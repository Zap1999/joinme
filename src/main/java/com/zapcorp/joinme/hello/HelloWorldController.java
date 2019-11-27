package com.zapcorp.joinme.hello;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class HelloWorldController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello, wassup?");
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserCreateRequest request) {
        return ResponseEntity.ok(userService.createUser(request));
    }
}
