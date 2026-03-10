package com.taskmanager.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

public String login(String username,String password){

return "JWT_TOKEN";

}

}