package com.wiley.beginningspring.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.lang.annotation.Annotation;
import java.util.Collections;

/**
 * Created by david on 6/1/16.
 */
public class Main {
    public static void main(String[] args){
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);
//        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/wiley/beginningspring/ch2/ch2-beans.xml");
//        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch2Configuration.class);
//
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo.getName());


        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext();
        applicationContext1.register(Ch2Configuration2.class);
        ConfigurableEnvironment environment = applicationContext1.getEnvironment();
        environment.setActiveProfiles("dev");

        MutablePropertySources propertySources = environment.getPropertySources();
        propertySources.addLast(new MapPropertySource("mapSource", Collections.singletonMap("name", (Object) "my foo")));

        applicationContext1.refresh();
        Foo foo2 = applicationContext1.getBean(Foo.class);
        System.out.println(foo2.getName());
    }

}
