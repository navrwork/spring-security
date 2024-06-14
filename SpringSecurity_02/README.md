# Spring Security App -- Version #2

## Scope
* Create a separate config for SecurityFilterChain and permit access to some URLs with auth and some without auth.
* It is still a single user based authentication, as configured in application.properties file. 

## Reference
* **[Spring Security Architecture | spring.io](https://docs.spring.io/spring-security/reference/servlet/architecture.html)**
* **[DelegatingFilterProxy](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-delegatingfilterproxy)**
* **[FilterChainProxy](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-filterchainproxy)**
* **[SecurityFilterChain](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-securityfilterchain)**
* **[Find the Registered Spring Security Filters | baeldung.com](https://www.baeldung.com/spring-security-registered-filters)**
* https://hatchjs.com/websecurityconfigureradapter-spring-boot-3-0-0/

## WebSecurityConfigurerAdapter Deprecated
* One of the most significant changes with Spring Boot 3.0.0 release is the deprecation of the WebSecurityConfigurerAdapter class.
* For more info refer to https://hatchjs.com/websecurityconfigureradapter-spring-boot-3-0-0/

## Default security config
* Default security config class: org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration (part of spring-boot-autoconfigure-3.x.jar)
* The default configuration for web security. It relies on Spring Security's content-negotiation strategy to determine what sort of authentication to use. 
* If the user specifies their own SecurityFilterChain bean, this will back-off completely and the users should specify all the bits that they want to configure as part of the custom security configuration.
* With SecurityFilterChainConfiguration, all requests are authenticated by default, if spring security is enabled. 

## Custom Security Config
* Dev can create a custom security config bean to return a customized SecurityFilterChain as needed.

