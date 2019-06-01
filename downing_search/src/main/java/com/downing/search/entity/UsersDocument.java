package com.downing.search.entity;

import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author downing
 * @descript
 */
@Document(indexName = "users", type = "test")
public class UsersDocument {
    private int id;
    private String username;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UsersDocument{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
