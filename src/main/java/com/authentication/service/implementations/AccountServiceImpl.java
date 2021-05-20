package com.authentication.service.implementations;

import com.authentication.model.AuthUser;
import com.authentication.repository.UserRepository;
import com.authentication.service.interfaces.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private UserRepository userRepository;

    @Override
    public AuthUser saveUser(String username, String password, String confirmedPassword, String email) {
//        AuthUser  user=userRepository.findByUsername(username);
 //       if(user!=null) throw new RuntimeException("User already exists");
        if(!password.equals(confirmedPassword)) throw new RuntimeException("Please confirm your password");
        AuthUser authUser=new AuthUser();
        authUser.setUsername(username);
        // TODO: Encode Password by BCryptPassword
        authUser.setPassword(password);
        authUser.setEmail(email);
        userRepository.save(authUser);
        return authUser;
    }

    @Override
    public AuthUser loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
