package com.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Repository
public class UserDao {
    public void save(){
        System.out.println("Dao层的Save方法");
    }
}
