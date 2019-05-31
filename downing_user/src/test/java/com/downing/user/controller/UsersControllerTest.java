package com.downing.user.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class UsersControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void findById() {
        System.out.println(testRestTemplate.exchange("/users/1", HttpMethod.GET, null, String.class).getBody());
    }
}