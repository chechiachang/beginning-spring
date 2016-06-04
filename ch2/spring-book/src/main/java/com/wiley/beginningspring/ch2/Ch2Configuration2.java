package com.wiley.beginningspring.ch2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by david on 6/2/16.
 */
@Configuration
public class Ch2Configuration2 {

    @Bean
    @Profile("dev")
    public Foo devFoo(@Value("${name}") String name){
        Foo foo = new Foo();
        foo.setName("dev" + name);
        return foo;
    }

    @Bean
    @Profile("prod")
    public Foo prodFoo(@Value("${name}") String name){
        Foo foo = new Foo();
        foo.setName("prod" + name);
        return foo;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcePlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
