package com.br.lukreitor.todospringboot.todowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("lukreitor");
        boolean isValidPassword = password.equalsIgnoreCase("123");   
        return isValidUserName && isValidPassword;
    }
}
