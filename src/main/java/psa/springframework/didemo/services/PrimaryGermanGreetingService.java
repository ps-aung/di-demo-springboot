package psa.springframework.didemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung at 08/11/2021
 */
@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
