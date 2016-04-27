package com.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.demo.dao.UserDao;
import com.demo.mapper.UserMapper;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Eason on 2016/4/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private UserDao dao;

    @Autowired
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
