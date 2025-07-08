package com.conceptandcoding.dependencyinjectionmasterclass.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    public Order o;


  // public final Order order; ==> error cannot used with immutable fields

   public User(){
       System.out.println("User Init");
   }




}
