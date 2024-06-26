package com.adsima.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "db")
public record DatabaseProperties(String username,
                                 String password,
                                 PoolProperties pool,
                                 String driver,
                                 String url,
                                 String hosts) {

    public record PoolProperties(Integer size,
                                         Integer timeout) {
    }
}
