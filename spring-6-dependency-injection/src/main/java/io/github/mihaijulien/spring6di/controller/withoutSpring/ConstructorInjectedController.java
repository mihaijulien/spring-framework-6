package io.github.mihaijulien.spring6di.controller.withoutSpring;

import io.github.mihaijulien.spring6di.services.GreetingService;


// Dependency Injection without Spring
// Using the constructor
// Optimal way to inject dependencies
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
