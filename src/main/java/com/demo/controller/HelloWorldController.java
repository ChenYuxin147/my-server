package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eason on 2016/4/16.
 */
@RestController
@RequestMapping(value="/")
public class HelloWorldController {

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    @ResponseBody
    public String HelloWorld(){
        return "Hello World!";
    }

}
