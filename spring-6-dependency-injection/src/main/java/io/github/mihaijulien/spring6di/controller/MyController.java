package io.github.mihaijulien.spring6di.controller;

import io.github.mihaijulien.spring6di.services.GreetingService;
import io.github.mihaijulien.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

// fake controller for test -> embedded tomcat not even added to the pom.xml plugins
// but the stereotype @Controller still will create this as a Spring bean
@Controller
public class MyController {

    private final GreetingService greetingService;

    // Dependencies without Dependency Injection
    // We do not pass the service to the constructor, so MyController has full control over how it is created
    // and used GreetingService
    // This is very rigid and NOT what is expected when using the Spring framework
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
