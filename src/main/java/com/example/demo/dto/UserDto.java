package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//encapsulates data, so it prevents it from floating in the app
public class UserDto {
    private int id;
    private String username;
    private String password;
    private String email;
}
