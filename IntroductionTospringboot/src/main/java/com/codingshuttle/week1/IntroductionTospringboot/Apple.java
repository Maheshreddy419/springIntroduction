package com.codingshuttle.week1.IntroductionTospringboot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {

    void eatApple(){
        System.out.println("Hello eating apple........");
    }
    @PostConstruct
    void callThisBeforeAppleCreated(){
        System.out.println("I am creating the apple before used");
    }
     @PreDestroy
    void destoryTheAppleBean(){
         System.out.println("Apple bean is destroying");
    }
}
