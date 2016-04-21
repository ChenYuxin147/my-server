package com.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Eason on 2016/4/16.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    private final static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        logger.info("spring-boot demo started......");
    }
}
