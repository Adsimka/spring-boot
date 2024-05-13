package com.adsima.spring.database.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
@Component("pool1")
@RequiredArgsConstructor
public class ConnectionPool
{
    @Value("${db.username}")
    private final String username;
    @Value("${db.pool.size}")
    private final Integer poolSize;

    @PostConstruct
    private void init() {
        log.info("Initialization of connection pool - {}", ConnectionPool.class.getName());
    }

    @PreDestroy
    private void destroy() {
        log.info("Destroying connection pool");
    }
}
