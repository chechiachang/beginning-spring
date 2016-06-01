package com.wiley.beginningspring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by david on 6/1/16.
 */
@Configuration
public class Ch2BeanConfiguration {

    @Bean
    public AccountService accountService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountDao(accountDao());
        return bean;
    }

    @Bean
    public AccountDao accountDao(){
        AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
        return bean;
    }
}
