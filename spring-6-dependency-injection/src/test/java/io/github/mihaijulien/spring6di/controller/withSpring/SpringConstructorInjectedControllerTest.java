package io.github.mihaijulien.spring6di.controller.withSpring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringConstructorInjectedControllerTest {

    @Autowired
    SpringConstructorInjectedController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}