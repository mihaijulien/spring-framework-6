package io.github.mihaijulien.spring6di.controller;

import org.springframework.stereotype.Controller;

// fake controller for test -> embedded tomcat not even added to the pom.xml plugins
// but the stereotype @Controller still will create this as a Spring bean
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("I'm in the controller");
        return "Hello Everyone!!";
    }
}
