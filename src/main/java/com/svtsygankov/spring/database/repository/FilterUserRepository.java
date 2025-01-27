package com.svtsygankov.spring.database.repository;

import com.svtsygankov.spring.database.entity.Role;
import com.svtsygankov.spring.database.entity.User;
import com.svtsygankov.spring.dto.PersonalInfo;
import com.svtsygankov.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findByFilter(UserFilter filter);

    List<PersonalInfo> findByCompanyIdAndRole(Integer companyId, Role role);

    void updateCompanyAndRole(List<User> users);

    void updateCompanyAndRoleNamed(List<User> users);
}
