package com.demo.controller;

import com.demo.model.User;
import com.demo.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Eason on 2016/4/17.
 */
@RestController
@RequestMapping(value = "/")
public class UserController {

    private final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserServiceImpl service;

    @RequestMapping(value = "/select-user/{name}", method = RequestMethod.GET)
    @ResponseBody
    public User SelectUser(@PathVariable("name") String name) {
        return service.SelectUser(name);
    }

    @RequestMapping(value = "/save-user/{name}/{age}/{email}/{gender}/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String SelectUser(@PathVariable("name") String name, @PathVariable("age") Integer age, @PathVariable("email") String email,
                             @PathVariable("gender") String gender, @PathVariable("id") Integer id) {
        User user = new User();
        user.setAge(age);
        user.setEmail(email);
        user.setGender(gender);
        user.setId(id == 0 ? null : id);
        user.setName(name);
        boolean flag = false;
        try {
            service.SaveOrUpdateUser(user);
            flag = true;
        } catch (Exception e) {
            logger.error(e);
        }
        return "{result:" + flag + "}";
    }

}
