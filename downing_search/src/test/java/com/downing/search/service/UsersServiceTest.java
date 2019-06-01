package com.downing.search.service;

import com.downing.search.entity.UsersDocument;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsersServiceTest {

    @Autowired
    private UsersService usersService;

    @Test
    public void findByID() {
        System.out.println(usersService.findByID(1));
    }

    @Test
    public void save() {
        UsersDocument usersDocument = new UsersDocument();
        usersDocument.setId(1);
        usersDocument.setUsername("张三");
        usersDocument.setCreateTime(new Date());
        usersService.save(usersDocument);
    }
}