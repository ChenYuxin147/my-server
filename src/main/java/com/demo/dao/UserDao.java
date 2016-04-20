package com.demo.dao;

import com.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by Eason on 2016/4/17.
 */
@Component
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    User findByName(String name);

}
