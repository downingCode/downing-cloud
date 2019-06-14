package com.downing.mq.controller;

import com.downing.common.entity.DowningResult;
import com.downing.mq.client.UserServiceclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author downing
 * @descript
 */
@RestController
@RequestMapping("/mq")
public class UserController {

    @Autowired
    private UserServiceclient userServiceclient;

    @GetMapping("/{id}")
    public DowningResult findUserById(@PathVariable int id) {
        return new DowningResult(200, "获取成功", userServiceclient.findById(id));
    }
}
