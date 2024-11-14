package io.github.mihaijulien.spring6di.controller.withoutSpring;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {
        MyController controller = new MyController();

        System.out.println(controller.sayHello());
    }
}