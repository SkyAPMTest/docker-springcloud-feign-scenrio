package org.skywalking.apm.testcase.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("org.skywalking.apm.testcase.spring")
@EnableFeignClients
public class Main extends SpringBootServletInitializer {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Main.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
