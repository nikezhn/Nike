package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient          //启动后会自动注册进eureka服务中
@MapperScan("com.cssl.mapper")
public class ProviderApplication8002 {

    public static void main(String[] args)	{

        SpringApplication.run(ProviderApplication8002.class, args);
    }

}
