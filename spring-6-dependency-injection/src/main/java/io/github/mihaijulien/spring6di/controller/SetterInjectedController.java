package io.github.mihaijulien.spring6di.controller;

import io.github.mihaijulien.spring6di.services.GreetingService;

// Dependency Injection without Spring
// Using setters
// Better than using properties, but not optimal.
// Problem: If this class is instantiated, but setGreetingService is not done, we get a NullPointerException
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
