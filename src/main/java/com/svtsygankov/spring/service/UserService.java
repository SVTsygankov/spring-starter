package com.svtsygankov.spring.service;


import com.svtsygankov.spring.database.repository.UserRepository;
import com.svtsygankov.spring.dto.UserReadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserReadDto> findAll() {
        return userRepository.findAll();
    }
}
