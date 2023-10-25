package com.hopefundteam18.hopefund.Service;

import com.hopefundteam18.hopefund.DTO.LoginDTO;
import com.hopefundteam18.hopefund.DTO.UserDTO;
import com.hopefundteam18.hopefund.LoginResponse;

public interface UserService {
    String addUser(UserDTO userDTO);
    LoginResponse loginUser(LoginDTO loginDTO);
}
