package com.svtsygankov.spring.http.rest;

import com.svtsygankov.spring.dto.UserFilter;
import com.svtsygankov.spring.dto.UserReadDto;
import com.svtsygankov.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@ControllerAdvice
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserRestController {

private final UserService userService;

    @GetMapping
    public String findAll(UserFilter filter, Pageable pageable) {
        List<UserReadDto> page = userService.findAll();
        return "user/users";
    }
}
