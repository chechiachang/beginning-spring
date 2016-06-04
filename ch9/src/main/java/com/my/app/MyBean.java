package com.my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by david on 6/4/16.
 */
@Component
public class MyBean {

    @Value("#{systemProperties['user.language']}")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
