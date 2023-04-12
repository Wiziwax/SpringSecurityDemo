package com.springsecuritydemo.springsecuritydemo.Entity;

import com.springsecuritydemo.springsecuritydemo.Security.CustomSecurityUser;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class Authorities implements GrantedAuthority {

    private static final long serialVersionUID = -8123526131047887755L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return authority;
    }


    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
