package com.mehmetsukrukavak.springbootfirst;

import com.mehmetsukrukavak.springbootfirst.model.Alien;
import com.mehmetsukrukavak.springbootfirst.model.Laptop;
import com.mehmetsukrukavak.springbootfirst.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);

        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);

        /*Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();*/


    }

}
