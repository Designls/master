package org.example.customer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class CustomerApplication {


    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
