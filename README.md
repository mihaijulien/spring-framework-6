## Spring Framework 6

### Notes from the course
---
#### Spring Framework vs Spring Boot

**Spring Framework** is a a collection of framework libraries:
- Dependency Injection, Web Transaction Management, etc.

**Spring Boot** is an automated tooling for Spring Framework applications;
- Think of it as a wrapper around Spring
- You can use Spring Framework without Spring Boot (but not Spring Boot without Spring Framework)

#### Spring Boot Features

- Curated "Starter" Dependencies for common components
- Sensible "Auto-COnfiguration" based on classes found on the classpath
  - For example, it will auto-configure an in memory database if H2 is on the classpath
- Externalized Configuration via files and environment variables
- Logging auto-configuration
- Performance Metrics
- Healthcheck endpoints
- Enhanced failure information

#### Spring MVC

MVC - common design pattern for GUI and Web Applications

**Model** - Simple POJO with collection of properties which may or may not be used by the view.

**View** - Data as requested by the client. Implemented with JSP, Thymeleaf, Jackson etc. Can be
HTML, JSON, XML, text, etc.

**Controller** - Java class implemented to handle request mapping. Should be a "traffic cop" and 
contain minimal business logic. Typically works in conjunction with a service, which contains business
logic.

#### Dependency Injection

Dependency injection allows you to inject dependencies into an object instead of creating the object inside the object. 
This makes the code more flexible and easy to test.

The class being injected really has no responsability instantiating that object that is being injected.


