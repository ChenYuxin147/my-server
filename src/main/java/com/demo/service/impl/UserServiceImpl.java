package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.mapper.UserMapper;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Eason on 2016/4/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper mapper;

    @Resource(name = "userDao")
    private UserDao dao;

    @Resource(name = "stringRedisTemplate")
    private StringRedisTemplate template;

    @Override
    public User selectUser(String name) {
        return mapper.SelectUser(name);
    }

    @Override
    public User saveOrUpdateUser(User user) {
        return dao.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        dao.delete(id);
    }
}
