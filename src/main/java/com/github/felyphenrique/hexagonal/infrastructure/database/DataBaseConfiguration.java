package com.github.felyphenrique.hexagonal.infrastructure.database;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.control")
    public DataSource dataSourceControl() {
        return DataSourceBuilder.create().build();
    }
}
