package com.wiley.beginning.spring.ch2;

/**
 * Created by david on 6/1/16.
 */
public interface AccountDao {

    void update(Account account);

    Account find(long accountId);
}
