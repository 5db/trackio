package com.trackio.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author jsingh on 2/11/14.
 */
@EnableAutoConfiguration
@Configuration
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        System.out.println("---===============================================================---");
        for(String beanName : context.getBeanDefinitionNames()) {
            System.out.println(context.getBean(beanName));
        }
        System.out.println("---===============================================================---");
    }
}
