package psa.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import psa.springframework.didemo.services.GreetingService;

/**
 * Created by pyaesoneaung at 08/11/2021
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
