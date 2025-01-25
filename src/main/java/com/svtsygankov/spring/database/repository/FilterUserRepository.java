package com.svtsygankov.spring.database.repository;

import com.svtsygankov.spring.database.entity.User;
import com.svtsygankov.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findByFilter(UserFilter filter);
}
