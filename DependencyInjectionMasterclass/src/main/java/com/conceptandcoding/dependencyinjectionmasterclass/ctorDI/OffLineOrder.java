package com.conceptandcoding.dependencyinjectionmasterclass.ctorDI;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("off")
public class OffLineOrder implements Order{
    @Override
    public void Order() {
        System.out.println("Offline order");
    }
}
