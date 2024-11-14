package io.github.mihaijulien.spring6di.controller.withoutSpring;

import io.github.mihaijulien.spring6di.services.GreetingService;

// Dependency Injection without Spring
// Using properties
// Less optimal way to inject dependencies.
// Problem: If this class is instantiated, but greetingService is not initialized, we get a NullPointerException
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
