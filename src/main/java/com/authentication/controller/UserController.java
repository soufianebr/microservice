package com.authentication.controller;

import com.authentication.model.AuthUser;
import com.authentication.service.interfaces.AccountService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private AccountService accountService;
    @PostMapping("/register")
    public AuthUser register(@RequestBody UserForm userForm){
        return  accountService.saveUser(
                userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword(), userForm.getEmail());
    }
}
@Data
class UserForm{
    private String username;
    private String password;
    private String confirmedPassword;
    private String email;
}
