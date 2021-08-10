package psa.springframework.didemo.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import psa.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by pyaesoneaung at 08/11/2021
 */
class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @BeforeEach
    void setUp() {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_PSA,getterInjectedController.sayHello());
    }
}