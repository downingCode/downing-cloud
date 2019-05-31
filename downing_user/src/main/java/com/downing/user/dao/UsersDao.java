package com.downing.user.dao;

import com.downing.user.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author downing
 * @descript
 */
@Repository
public interface UsersDao extends CrudRepository<Users, Integer> {
}
