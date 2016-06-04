package com.wiley.ch8;

import org.springframework.stereotype.Component;

/**
 * Created by david on 6/3/16.
 */
@Component
public class MyBean {

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayHello(String param){
        System.out.println("Actual method execution with param: " + param);
    }
}
