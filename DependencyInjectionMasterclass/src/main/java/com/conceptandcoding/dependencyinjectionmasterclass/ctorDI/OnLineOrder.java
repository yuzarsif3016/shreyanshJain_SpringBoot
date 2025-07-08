package com.conceptandcoding.dependencyinjectionmasterclass.ctorDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("on")
public class OnLineOrder implements Order{
    @Override
    public void Order() {
        System.out.println("OnLineOrder order");
    }
}

