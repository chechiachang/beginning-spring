package com.my;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by david on 6/4/16.
 */
public class Main {

    public static void main(String... args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userSerivce = context.getBean(UserService.class);
        User userFetch1 = userSerivce.getUser(1);
        System.out.println(userFetch1);

        User userFetch2 = userSerivce.getUser(2);
        System.out.println(userFetch2);

        ApplicationContext context1 = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService userService = context1.getBean(UserService.class);
        User userFetch3 = userService.getUser(1);
        System.out.println(userFetch3);
        User userFetch4 = userService.getUser(2);
        System.out.println(userFetch4);
    }
}
