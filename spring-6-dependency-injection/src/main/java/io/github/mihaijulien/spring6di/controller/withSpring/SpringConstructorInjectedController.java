package io.github.mihaijulien.spring6di.controller.withSpring;

import io.github.mihaijulien.spring6di.services.SpringGreetingServiceImpl;
import org.springframework.stereotype.Controller;

// Dependency Injection with Spring
// Using the @Controller stereotype we indicate that this class is a Spring component.
@Controller
public class SpringConstructorInjectedController {

    private final SpringGreetingServiceImpl greetingService;

    public SpringConstructorInjectedController(SpringGreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
