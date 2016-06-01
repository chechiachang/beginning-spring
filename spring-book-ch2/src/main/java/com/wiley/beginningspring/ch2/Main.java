package com.wiley.beginningspring.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by david on 6/1/16.
 */
public class Main {
    public static void main(String[] args){
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);
//        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/wiley/beginningspring/ch2/ch2-beans.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

    }

}
