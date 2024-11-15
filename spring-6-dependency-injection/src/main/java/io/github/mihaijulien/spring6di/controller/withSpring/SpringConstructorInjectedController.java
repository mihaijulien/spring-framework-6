package io.github.mihaijulien.spring6di.controller.withSpring;

import io.github.mihaijulien.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Dependency Injection with Spring
// Using the @Controller stereotype we indicate that this class is a Spring component.
@Controller
public class SpringConstructorInjectedController {

    @Autowired
    private final GreetingService greetingService;

    public SpringConstructorInjectedController(@Qualifier("springServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
