package psa.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;
import psa.springframework.didemo.services.GreetingService;

/**
 * Created by pyaesoneaung at 08/11/2021
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
