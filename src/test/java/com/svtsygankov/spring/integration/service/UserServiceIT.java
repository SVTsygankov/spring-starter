package com.svtsygankov.spring.integration.service;

import com.svtsygankov.spring.database.pool.ConnectionPool;
import com.svtsygankov.spring.integration.annotation.IT;
import com.svtsygankov.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;

@IT
@RequiredArgsConstructor
public class UserServiceIT {

    private final UserService userService;

    @SpyBean(name = "pool1")
    private ConnectionPool pool1;

    @Test
    void test() {

    }
}
