package io.github.mihaijulien.spring6di;

import io.github.mihaijulien.spring6di.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class Spring6DIApplicationTests {

    // First way of using MyController: ApplicationContext is injected
    @Autowired
    ApplicationContext applicationContext;

    // Second way of using MyController: As it is a test we can directly inject an instance (bean) of MyController
    @Autowired
    MyController myController;

    // 1st way: We use applicationContext to obtain an instance (bean) of MyController and use it
    @Test
    void testGetControllerFromCtx(){
        MyController myController = applicationContext.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }

    // 2nd way: myController is already a concrete instance (bean) and we use it
    @Test
    void testAutowireOfController(){
        System.out.println(myController.sayHello());
    }


    @Test
    void contextLoads() {
    }

}
