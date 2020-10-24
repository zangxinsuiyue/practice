package com.spring.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Repository
public class UserDaoImpl extends UserDao {
    @Override
    public void save(){
        System.out.println("dao子类的Save方法");
    }
}
