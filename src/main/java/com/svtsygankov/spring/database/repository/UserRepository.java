package com.svtsygankov.spring.database.repository;

import com.svtsygankov.spring.database.pool.ConnectionPool;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    @Qualifier(value = "pool1")
    private final ConnectionPool connectionPool;
}
