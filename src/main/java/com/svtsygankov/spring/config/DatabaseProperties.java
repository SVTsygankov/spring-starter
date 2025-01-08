package com.svtsygankov.spring.config;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;
import java.util.Map;

@ConstructorBinding
@ConfigurationProperties(prefix = "db")
public record DatabaseProperties(String url,
                                 String username,
                                 String password,
                                 String driver,
                                 PoolProperties pool,
                                 List<PoolProperties> pools,
                                 Map<String, Object> properties) {

    public static record PoolProperties (Integer size,
                                         Integer timeout) {

    }
}
