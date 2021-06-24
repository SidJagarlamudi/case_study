package com.example.demo1.security;

//import com.example.demo1.models.User;
//import  com.example.demo1.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

//public class AppUserDetails implements UserDetails {
//
//
//    User user;
//    List<String> roleList;
//
//    public AppUserDetails(Student student, List<String> roleList) {
//        this.user = user;
//        this.roleList = roleList;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<SimpleGrantedAuthority> grList = new ArrayList<>();
//        roleList.forEach(role -> grList.add(new SimpleGrantedAuthority(role)));
//        return grList;
//    }
//
//    @Override
//    public String getPassword() {
//        return student.getSPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}