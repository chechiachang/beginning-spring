package com.my.app;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by david on 6/4/16.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBean mybean = context.getBean(MyBean.class);
        System.out.println(mybean.getMessage());

        Show show2 = (Show) context.getBean("show2");
        show2.present();
        Show show3 = (Show) context.getBean("show3");
        show3.present();
    }
}
