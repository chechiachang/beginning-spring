package com.wiley.beginningspring.ch2;

/**
 * Created by david on 6/1/16.
 */
public interface AccountService {
    void depositMoney(long accountId, double amount) throws Exception;

    Account getAccount(long accountId);
}
