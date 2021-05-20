package com.authentication.service.interfaces;

import com.authentication.model.AuthUser;

public interface AccountService {
    public AuthUser saveUser(String username, String password, String confirmedPassword, String email);
    public AuthUser loadUserByUsername(String username);
}
