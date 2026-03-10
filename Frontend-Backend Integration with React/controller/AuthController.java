package com.taskmanager.controller;

import org.springframework.web.bind.annotation.*;
import com.taskmanager.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

private final AuthService service;

public AuthController(AuthService service){
this.service = service;
}

@PostMapping("/login")
public String login(@RequestParam String username,
@RequestParam String password){

return service.login(username,password);

}

}