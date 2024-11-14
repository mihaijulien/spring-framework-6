package io.github.mihaijulien.spring6di.controller.withSpring;

import io.github.mihaijulien.spring6di.services.SpringGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// Dependency Injection with Spring
// Using the @Controller stereotype we indicate that this class is a Spring component.
@Controller
public class SpringPropertyInjectedController {

    // It is mandatory to tell Spring to inject the dependency.
    // We can annotate the property or the setter with the @Autowired annotation
    @Autowired
    SpringGreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
