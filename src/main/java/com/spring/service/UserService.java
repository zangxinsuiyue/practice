package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void save(){
        userDao.save();
    }
}
