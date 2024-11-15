package io.github.mihaijulien.spring6di.services;

import org.springframework.stereotype.Service;

// Another way to indicate which GreetingService implementation we want Spring to inject is to indicate a name
// in the @Service annotation (give the bean a name) and then reference it using the @Qualifier annotation.
// Indicate that by default the name was greetingServicePropertyInjected and has been changed to propertyGreetingService
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Don't do property injection!";
    }
}
