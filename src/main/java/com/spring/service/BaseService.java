package com.spring.service;

import com.spring.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 */
public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;
    public void save(){
        baseDao.save();
    }
}
