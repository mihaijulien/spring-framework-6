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

