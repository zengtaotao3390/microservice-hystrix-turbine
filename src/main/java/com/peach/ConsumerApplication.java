package com.peach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zengtao on 2017/11/14.
 * srpingBootApplication 是一个注解集合，它整合了@Configuration, @EnableAutoConfiguration,@ComponentScan
 */
@SpringBootApplication
@EnableTurbine
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
