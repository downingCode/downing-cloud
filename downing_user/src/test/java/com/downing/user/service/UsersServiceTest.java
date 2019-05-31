package com.downing.user.service;

import com.downing.user.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsersServiceTest {

    @Autowired
    private UsersService usersService;

    @Test
    public void findById() {
        Users users = usersService.findById(1);
        System.out.println(users);
    }
}