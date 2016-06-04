package com.wiley.beginningspring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by david on 6/2/16.
 */
@Configuration
public class Configuration2 {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        foo.setName("new foo");
        return foo;
    }
}
