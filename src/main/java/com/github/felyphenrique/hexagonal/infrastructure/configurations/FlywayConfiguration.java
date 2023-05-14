package com.github.felyphenrique.hexagonal.infrastructure.configurations;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class FlywayConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.control")
    public DataSource flywayDataSourceControl() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @DependsOn(value = "flywayDataSourceControl")
    public Flyway flyway() {
        return Flyway.configure().dataSource(flywayDataSourceControl()).load();
    }
}
