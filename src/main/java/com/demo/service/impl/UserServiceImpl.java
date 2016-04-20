package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.mapper.UserMapper;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public User SelectUser(String name) {
        return dao.findByName(name);
    }

    @Override
    public void SaveOrUpdateUser(User user) {
        if (user.getId() == null) {
            mapper.InsertUser(user);
        }else{
            dao.save(user);
        }
    }
}
