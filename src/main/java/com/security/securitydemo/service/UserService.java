package com.security.securitydemo.service;


import com.security.securitydemo.dto.RegistrationDto;
import com.security.securitydemo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(RegistrationDto registrationDto);
}
