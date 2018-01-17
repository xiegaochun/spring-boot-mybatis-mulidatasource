package com.chun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by xiegaochun on 2018/1/17.
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)   //开启事物管理功能
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
