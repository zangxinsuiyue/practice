package com.spring.service;

import com.spring.dao.BaseDao;
import com.spring.dao.UserDao;
import com.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class UserService extends BaseService<User> {
}
