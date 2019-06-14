package com.downing.user.controller;

import com.downing.common.entity.DowningResult;
import com.downing.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author downing
 * @descript
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public DowningResult findById(@PathVariable Integer id) {
        return new DowningResult(200, "获取成功", usersService.findById(id));
    }
}
