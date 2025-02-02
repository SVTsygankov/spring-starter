package com.svtsygankov.spring.mapper;

public interface Mapper<F, T> {
    T map(F object);
}
