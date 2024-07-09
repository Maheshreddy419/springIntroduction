package com.codingshuttle.week1.IntroductionTospringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton")
    Apple getApple(){
        return new Apple();
    }
}
