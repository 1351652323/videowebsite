package com.kaiguo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kaiguo.dao")
public class VideosApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideosApplication.class, args);
    }
}
