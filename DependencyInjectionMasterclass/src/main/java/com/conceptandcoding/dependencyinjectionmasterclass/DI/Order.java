package com.conceptandcoding.dependencyinjectionmasterclass.DI;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Order {
    public Order(){
        System.out.println("Order init");
    }

    public void Process(){
        System.out.println("process called ... 💕");
    }
}
