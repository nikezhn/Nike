package com.cssl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
//开启Feign支持
@EnableFeignClients
public class ConsumerApplication8081 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication8081.class, args);
    }
}
