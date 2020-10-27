package com.spring.dao;

import com.spring.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends BaseDao<Book> {
    @Override
    public void save() {
        System.out.println("BookDao得save方法");
    }
}
