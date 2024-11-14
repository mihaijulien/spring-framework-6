package io.github.mihaijulien.spring6di.controller.withSpring;

import io.github.mihaijulien.spring6di.controller.withoutSpring.PropertyInjectedController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// Dependency Injection with Spring
// Using the @SpringBootTest stereotype we tell JUnit that we want to load the Spring context. When the Spring context is
// executed, it will look at the configuration of the application context determined for our application,
// it will scan the components inside the package and sub-packages where the main class is.
@SpringBootTest
class SpringPropertyInjectedControllerTest {

    // Spring, in order to perform dependency injection with properties, needs the @Autowired annotation
    @Autowired
    PropertyInjectedController propertyInjectedController;

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}