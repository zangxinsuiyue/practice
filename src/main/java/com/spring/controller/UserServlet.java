package com.spring.controller;

import com.spring.entity.Job;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 */
@Controller
public class UserServlet {
    private UserService userService;

    public UserServlet() {
        System.out.println("无参构造器启动了");
        System.out.println(userService);
    }
    @Autowired
    public UserServlet(UserService userService) {
        System.out.println("有参构造启动了");
        System.out.println(userService);
        this.userService = userService;
        System.out.println(this.userService);
    }

//    @Autowired
//    public void setUserService(UserService userService){
//        System.out.println("set方法启动了");
//        System.out.println(userService);
//    }
}
