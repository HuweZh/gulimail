package com.huhusw.gulimallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.huhusw.gulimallproduct.dao")
public class GulimallProduct {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProduct.class,args);
    }
}
