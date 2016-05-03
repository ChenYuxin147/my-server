package com.demo.mapper;

import com.demo.Application;
import com.demo.dao.UserDao;
import com.demo.model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Chenyuxin on 2016/5/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserMapperTest {
    private final static Logger log = Logger.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper mapper;

    @Test
    public void AddUserTest() {
        User temp = mapper.SelectUser("eason");
        if (temp != null) {
            log.info("id : " + temp.getId());
        }
    }

}
