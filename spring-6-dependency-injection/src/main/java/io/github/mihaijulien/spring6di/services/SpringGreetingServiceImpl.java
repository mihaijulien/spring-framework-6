package io.github.mihaijulien.spring6di.services;

import org.springframework.stereotype.Service;

// To use the Spring Framework, the first thing is to annotate this class with the Spring @Service stereotype
// With this we indicate that this class is a component that Spring can handle and that it is injectable.
@Service
public class SpringGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from base service";
    }
}
