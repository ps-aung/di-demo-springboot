package psa.springframework.didemo.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import psa.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by pyaesoneaung at 08/11/2021
 */
class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_PSA,propertyInjectedController.sayHello());
    }
}