package com.svtsygankov.spring.mapper;

import com.svtsygankov.spring.database.entity.User;
import com.svtsygankov.spring.dto.CompanyReadDto;
import com.svtsygankov.spring.dto.UserReadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UserReadMapper implements Mapper<User, UserReadDto> {

    private final CompanyReadMapper companyReadMapper;
    @Override
    public UserReadDto map(User object) {
        var company = Optional.ofNullable(object.getCompany())
                .map(companyReadMapper::map)
                .orElse(null);
        return new UserReadDto(
                object.getId(),
                object.getUsername(),
                object.getBirthDate(),
                object.getFirstname(),
                object.getLastname(),
                object.getImage(),
                object.getRole(),
                company
        );
    }
}
