package psa.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung at 08/11/2021
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor";
    }
}
