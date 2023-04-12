package com.springsecuritydemo.springsecuritydemo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class Learning_Things {

    @Test
    public void encrypt_password(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("password99");
        System.out.println(encodedPassword);
    }


}
