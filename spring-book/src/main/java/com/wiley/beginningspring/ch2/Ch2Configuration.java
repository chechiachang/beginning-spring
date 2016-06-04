package com.wiley.beginningspring.ch2;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by david on 6/2/16.
 */
@Configuration
public class Ch2Configuration {
    @Bean
    public AccountDao accountDaoJdbc(){
        AccountDaoJdbcImple bean = new AccountDaoJdbcImple();
        return bean;
    }

    @Qualifier("name")
    @Bean(autowire = Autowire.BY_TYPE)
    public AccountService accountService(){
        AccountService bean = new AccountService() {
            @Override
            public void depositMoney(long accountId, double amount) throws Exception {

            }

            @Override
            public Account getAccount(long accountId) {
                return null;
            }
        };
        return bean;
    }
}
