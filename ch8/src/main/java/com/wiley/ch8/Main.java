package com.wiley.ch8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by david on 6/3/16.
 */
public class Main {

    public static void main(String... args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml", Main.class);
        MyBean myBean = context.getBean(MyBean.class);
        myBean.sayHello();

        MyOtherBean myOtherBean = context.getBean(MyOtherBean.class);
        myOtherBean.sayHelloDelayed();

//        Object pegasus = context.getBean("pegasus");
//        ((Horse) pegasus).ride();
//        ((IBird) pegasus).fly();
    }
}
