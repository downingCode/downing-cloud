package com.downing.user.controller;

import com.downing.common.entity.DowningResult;
import com.downing.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author downing
 * @descript
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @PostMapping("/{id}")
    public DowningResult findById(@PathVariable Integer id) {
        return new DowningResult(200, "获取成功", usersService.findById(id));
    }
}
