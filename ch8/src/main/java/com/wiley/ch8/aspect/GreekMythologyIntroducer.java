package com.wiley.ch8.aspect;

import com.wiley.ch8.Bird;
import com.wiley.ch8.IBird;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by david on 6/4/16.
 */
@Component
@Aspect
public class GreekMythologyIntroducer {
    @DeclareParents(value="com.wiley.ch8.Pegasus+", defaultImpl = Bird.class)
    public static IBird iBird;
}
