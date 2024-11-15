package io.github.mihaijulien.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Since there are two GreetingService implementations, how does Spring know which implementation to inject?
// It doesn't, so this must be indicated.
// One way is, when creating the interface implementation, to indicate that this class is the one that should always
// be injected unless otherwise indicated. For this there is the @Primary annotation
@Primary
@Service
public class GreetingServicePrimary implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from primary bean!";
    }
}
