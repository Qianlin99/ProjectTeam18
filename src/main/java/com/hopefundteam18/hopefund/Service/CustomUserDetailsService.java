package com.hopefundteam18.hopefund.Service;

import com.hopefundteam18.hopefund.Entity.User;
import com.hopefundteam18.hopefund.Repo.UserRepo;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService /*implements UserDetailsService*/ {

    private UserRepo userRepo;

    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }

        return new CustomUserDetail(user);

    }*/
}
