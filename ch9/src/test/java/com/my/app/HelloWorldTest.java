package com.my.app;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by david on 6/4/16.
 */
public class HelloWorldTest {

    ExpressionParser parser;

    @Before
    public void Setup(){
        parser = new SpelExpressionParser();
    }

    @Test
    public void helloWorldParsedOK(){
        Expression expression = parser.parseExpression("'Hello world'");
        String value = expression.getValue(String.class);

    }


}
