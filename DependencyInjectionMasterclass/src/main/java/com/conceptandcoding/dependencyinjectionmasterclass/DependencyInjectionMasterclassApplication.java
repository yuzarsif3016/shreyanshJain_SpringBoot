package com.conceptandcoding.dependencyinjectionmasterclass;

import com.conceptandcoding.dependencyinjectionmasterclass.ctorDI.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionMasterclassApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionMasterclassApplication.class, args);
        Customer bean = context.getBean(Customer.class);
        bean.Orderred();
    }

}
