package com.example.demo.services;


import com.example.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

public class MyUserDetailsService{}

//@Service
//public class MyUserDetailsService implements UserDetailsService {
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        var user = userService.findByUsername(username);
//        if(user == null){
//            throw new UsernameNotFoundException("Username " + username + " not found");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getGrantedAuthorities(user));
//    }
//
//    private Collection<GrantedAuthority> getGrantedAuthorities(User user){
//        return user.getAcl().stream()
//                .map(authority -> new SimpleGrantedAuthority("ROLE_" + authority))
//                .collect(Collectors.toList()); //Authority control list
//    }
//}
