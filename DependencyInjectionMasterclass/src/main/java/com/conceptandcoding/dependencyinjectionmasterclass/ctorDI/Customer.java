package com.conceptandcoding.dependencyinjectionmasterclass.ctorDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    Order order;
    public Customer(@Qualifier("off") Order order){
        this.order  = order;
        System.out.println("Customer initialized ");
    }

    public void Orderred(){
        order.Order();
    }
}
