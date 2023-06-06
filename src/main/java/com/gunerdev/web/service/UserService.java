package com.gunerdev.web.service;

import com.gunerdev.web.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> findAllUsers();

}
