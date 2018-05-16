package com.demo.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Eason on 2016/4/21 0021.
 */
@Configuration
@ConfigurationProperties(prefix = "spring.datasource.hikari")
public class DataSourceConfig extends HikariConfig {

    @Override
    public DataSource getDataSource() {
        return new HikariDataSource(this);
    }

    @Bean
    public DataSource dataSource(){
        return new HikariDataSource(this);
    }

}
