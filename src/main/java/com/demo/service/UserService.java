package com.demo.service;

import com.demo.model.User;

/**
 * Created by Eason on 2016/4/17.
 */
public interface UserService {

    User selectUser(String name);

    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

}
