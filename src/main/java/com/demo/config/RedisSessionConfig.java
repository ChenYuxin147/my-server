package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Chenyuxin on 2016/4/20.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}