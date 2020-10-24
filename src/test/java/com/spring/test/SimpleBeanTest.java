package com.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.controller.UserServlet;
import com.spring.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class SimpleBeanTest {
    /**
     * 测试简单属性
     */
    @Test
    public void IOCTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object user = applicationContext.getBean("user");
        Object cloneUser = applicationContext.getBean("cloneUser");
        System.out.println(cloneUser);
        System.out.println(user);
    }

    @Test
    public void connectorPoolTest() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource pool = (DruidDataSource) applicationContext.getBean("pool");
        System.out.println(pool.getConnection());
    }

    @Test
    public void autowireTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void autowireByAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireByAnnotation.xml");
        UserServlet userServlet = (UserServlet) applicationContext.getBean("userServlet");
//        userServlet.save();
    }
}

