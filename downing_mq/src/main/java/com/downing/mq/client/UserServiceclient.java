package com.downing.mq.client;

import com.downing.common.entity.DowningResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author downing
 * @descript
 */
@FeignClient("downing-user")//指定从哪个服务去调用
public interface UserServiceclient {

    @GetMapping("/users/{id}")
    public DowningResult findById(@PathVariable("id") int id);
}
