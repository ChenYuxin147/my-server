package com.demo.mapper;

import com.demo.model.User;

/**
 * Created by Eason on 2016/4/17.
 */
public interface UserMapper {

    User SelectUser(String name);

    void InsertUser(User user);
}
