package psa.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung at 08/11/2021
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_PSA="Hello PSA!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_PSA;
    }
}
