package com.svtsygankov.spring.service;

import com.svtsygankov.spring.database.repository.CompanyRepository;
import com.svtsygankov.spring.database.repository.CrudRepository;
import com.svtsygankov.spring.database.repository.UserRepository;
import com.svtsygankov.spring.entity.Company;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(@Qualifier(value = "userRepository")UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
