package service.impl;

import com.gunerdev.web.dto.UserDTO;
import com.gunerdev.web.models.User;
import com.gunerdev.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> findAllUsers() {
       List<User> users = userRepository.findAll();
       //Since the return type is UserDTO, we have to map User -> UserDTO manually.
       return users.stream().map((user)->mapToUserDTO(user)).collect(Collectors.toList());
    }

    private UserDTO mapToUserDTO(User user){
        UserDTO userDto = UserDTO.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .profileImage(user.getProfileImage())
                .gender(user.getGender())
                .country(user.getCountry())
                .phoneNo(user.getPhoneNo())
                .role(user.getRole())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
        return userDto;
    }
}
