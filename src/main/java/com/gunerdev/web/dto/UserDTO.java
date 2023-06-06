package com.gunerdev.web.dto;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class UserDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String profileImage;
    private String gender;
    private String country;
    private String phoneNo;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
