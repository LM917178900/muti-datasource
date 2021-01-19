package com.lei.min;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.lei.min.**.mapper"})
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class MinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinApplication.class, args);
    }

}
