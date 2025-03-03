package com.svtsygankov.spring.dto;

import com.svtsygankov.spring.database.entity.Role;
import lombok.Value;

import java.time.LocalDate;

@Value
public class UserReadDto {
    Long id;
    String username;
    LocalDate birthDate;
    String firstname;
    String lastname;
    String Image;
    Role role;
    CompanyReadDto company;
}


