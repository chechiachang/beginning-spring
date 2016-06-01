package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by david on 6/1/16.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);

        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        //do something

    }

}
