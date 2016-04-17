package com.demo.service.impl;

import com.demo.mapper.UserMapper;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Eason on 2016/4/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource(name="userMapper")
    private UserMapper mapper;

    @Override
    public User SelectUser(String name) {
        return mapper.SelectUser(name);
    }

    @Override
    public void SaveOrUpdateUser(User user) {
       mapper.InsertUser(user);
    }
}
