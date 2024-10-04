package io.github.mihaijulien;

import io.github.mihaijulien.spring6di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DIApplication{
    public static void main(String[] args) {

        // Since we don't have Tomcat (we haven't added the web dependency), we modify the run so that it
        // passes it to an application context variable
        ApplicationContext ctx = SpringApplication.run(Spring6DIApplication.class, args);

        // We go to the Spring context and ask directly for an instance of MyController.
        // This is an example of how Spring and the Spring context see the controller that has been annotated indicating
        // that it is a Spring Bean.
        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main method");

        // Executing the method from the Spring context.
        System.out.println(controller.sayHello());
    }
}