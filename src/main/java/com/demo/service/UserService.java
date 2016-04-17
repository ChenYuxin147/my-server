package com.demo.service;

import com.demo.model.User;

/**
 * Created by Eason on 2016/4/17.
 */
public interface UserService {

    User SelectUser(String name);

    void SaveOrUpdateUser(User user);

}
