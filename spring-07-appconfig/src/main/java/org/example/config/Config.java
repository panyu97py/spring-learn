package org.example.config;

import org.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Config {

    @Bean
    public User getUser(){
        return new User();
    }
}
