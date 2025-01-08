package com.svtsygankov.spring.service;

import com.svtsygankov.spring.database.repository.CrudRepository;
import com.svtsygankov.spring.database.repository.UserRepository;
import com.svtsygankov.spring.database.entity.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;
}
