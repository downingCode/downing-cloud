package com.downing.user.service;

import com.downing.user.dao.UsersDao;
import com.downing.user.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author downing
 * @descript
 */
@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    public Users findById(int id) {
        return usersDao.findById(id).orElseThrow(() -> new RuntimeException("该用户不存在"));
    }
}
