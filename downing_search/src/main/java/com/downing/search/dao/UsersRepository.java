package com.downing.search.dao;

import com.downing.search.entity.UsersDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author downing
 * @descript
 */
@Repository
public interface UsersRepository extends ElasticsearchCrudRepository<UsersDocument,Integer> {
}
