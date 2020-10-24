package com.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private String username;
    private Integer age;
    private String address;
    private String sex;
    private Date birthday;
    private List<Job> jobs;
    private Map<String, String> parent;
}
