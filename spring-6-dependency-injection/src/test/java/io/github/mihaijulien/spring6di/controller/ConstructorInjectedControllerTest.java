package io.github.mihaijulien.spring6di.controller;

import io.github.mihaijulien.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    // Note that although it is a test, it is imitating what the Spring Framework does.
    // In tests, it is a good idea to make an assertion that throws a Runtime Error if
    // null is passed to GreetingService
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}