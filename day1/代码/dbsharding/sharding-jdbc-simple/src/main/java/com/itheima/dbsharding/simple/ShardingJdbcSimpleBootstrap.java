package com.itheima.dbsharding.simple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = SpringBootConfiguration.class)
@MapperScan(basePackages = {"com.itheima.dbsharding.simple.dao"})
@SpringBootApplication
public class ShardingJdbcSimpleBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcSimpleBootstrap.class, args);
    }

}
