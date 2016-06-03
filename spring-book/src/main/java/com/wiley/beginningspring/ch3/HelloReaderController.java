package com.wiley.beginningspring.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by david on 6/3/16.
 */
@Controller
public class HelloReaderController {

    @RequestMapping(value = "/hello")
    public ModelAndView sayHello(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello!");
        mv.setViewName("helloReader");
        return mv;
    }
}
