package com.wiley.ch8;

import org.springframework.stereotype.Component;

/**
 * Created by david on 6/3/16.
 */
@Component
public class MyOtherBean {

    public void sayHelloDelayed() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Hello again!");
    }
}
