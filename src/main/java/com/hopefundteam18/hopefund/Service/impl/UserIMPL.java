package com.hopefundteam18.hopefund.Service.impl;
import com.hopefundteam18.hopefund.DTO.LoginDTO;
import com.hopefundteam18.hopefund.DTO.UserDTO;
import com.hopefundteam18.hopefund.Entity.User;
import com.hopefundteam18.hopefund.LoginResponse;
import com.hopefundteam18.hopefund.Repo.UserRepo;
import com.hopefundteam18.hopefund.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getId(),
                userDTO.getUserType(),
                userDTO.getContactNum(),
                userDTO.getEmail(),
                userDTO.getUsername(),
                userDTO.getPassword()
//                this.passwordEncoder.encode(userDTO.getPassword())
        );
        userRepo.save(user);
        return user.getUsername();
    }

    UserDTO userDTO;
    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        /*if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                    Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                    if (user.isPresent()) {
                        return new LoginResponse("Login Success", true);
                    } else {
                        return new LoginResponse("Login Failed", false);
                    }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }*/
        return new LoginResponse("Logintest", true);
    }
}
