package com.downing.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author downing
 * @descript
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MqApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqApplication.class);
    }
}
