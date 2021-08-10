package psa.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import psa.springframework.didemo.services.GreetingService;

/**
 * Created by pyaesoneaung at 08/11/2021
 */
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
