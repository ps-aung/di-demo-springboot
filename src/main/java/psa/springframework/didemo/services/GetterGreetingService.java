package psa.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung at 08/11/2021
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
