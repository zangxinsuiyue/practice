package com.spring.dao;

import com.spring.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Repository
public class UserDao extends BaseDao<User> {
    @Override
    public void save(){
        System.out.println("UserDao层的Save方法");
    }
}
