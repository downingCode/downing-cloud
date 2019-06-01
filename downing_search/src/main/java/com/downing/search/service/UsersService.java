package com.downing.search.service;

import com.downing.search.dao.UsersRepository;
import com.downing.search.entity.UsersDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author downing
 * @descript
 */
@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    public UsersDocument findByID(int id) {
        return usersRepository.findById(id).orElseThrow(() -> new RuntimeException("该用户索引不存在"));
    }

    /**
     * 保存
     *
     * @param usersDocument
     */
    public void save(UsersDocument usersDocument) {
        usersRepository.save(usersDocument);
    }
}
