package com.demo.mapper;

import com.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by Eason on 2016/4/17.
 */
@Mapper
public interface UserMapper {

    User SelectUser(String name);

}
