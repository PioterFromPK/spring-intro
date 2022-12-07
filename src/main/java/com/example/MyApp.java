package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        MessageService messageService2 = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(messageService2.hashCode());
    }
}
