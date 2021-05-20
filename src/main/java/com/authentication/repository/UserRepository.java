package com.authentication.repository;

import com.authentication.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository  extends JpaRepository<AuthUser,Long> {
    public AuthUser findByUsername(String username);
}
