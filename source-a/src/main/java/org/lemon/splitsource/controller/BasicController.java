package org.lemon.splitsource.controller;

import org.lemon.splitsource.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BasicController {

    @GetMapping("/user")
    public List<User> getUserList() {
        return Collections.singletonList(User.builder().firstName("Joe").lastName("Jones").build());
    }

}
