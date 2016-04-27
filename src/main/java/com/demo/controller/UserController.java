package com.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.demo.model.User;
import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Eason on 2016/4/17.
 */
@RestController
@RequestMapping(value = "/")
public class UserController {

    private final Logger logger = Logger.getLogger(UserController.class);

    @Resource(name = "userServiceImpl")
    private UserServiceImpl service;

    @Cacheable(value = "searchUser", keyGenerator = "defaultKeyGen")
    @RequestMapping(value = "/select-user/{name}", method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@PathVariable("name") String name) {
        return service.selectUser(name);
    }

    @RequestMapping(value = "/add-user/{name}/{age}/{email}/{gender}", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addUser(@PathVariable("name") String name, @PathVariable("age") Integer age, @PathVariable("email") String email,
                              @PathVariable("gender") String gender) {
        User user = new User();
        user.setAge(age);
        user.setEmail(email);
        user.setGender(gender);
        user.setName(name);
        boolean flag = false;
        try {
            service.saveOrUpdateUser(user);
            flag = true;
        } catch (Exception e) {
            logger.error(e);
        }
        JSONObject obj = new JSONObject();
        obj.put("result", flag);
        return obj;
    }

    @RequestMapping(value = "/delete-user/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public JSONObject deleteUser(@PathVariable("id") Long id) {
        boolean flag = false;
        try {
            service.deleteUser(id);
            flag = true;
        } catch (Exception e) {
            logger.error(e);
        }
        JSONObject obj = new JSONObject();
        obj.put("result", flag);
        return obj;
    }

}
