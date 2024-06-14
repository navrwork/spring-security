# Spring Security App -- Version #1

## Scope
* Create a basic Spring boot app using Spring Security module.
* All API access needs to be authenticated using credentials configured in application.properties file.

## Reference
* **[Spring Security Architecture | spring.io](https://docs.spring.io/spring-security/reference/servlet/architecture.html)**
* **[DelegatingFilterProxy](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-delegatingfilterproxy)**
* **[FilterChainProxy](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-filterchainproxy)**
* **[SecurityFilterChain](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-securityfilterchain)**
* **[Find the Registered Spring Security Filters | baeldung.com](https://www.baeldung.com/spring-security-registered-filters)**

## SecurityFilterChain
![securityfilterchain.png](https://docs.spring.io/spring-security/reference/_images/servlet/architecture/securityfilterchain.png)

## Additional Notes
* If you try to troubleshoot Spring Security’s Servlet support, adding a debug point in FilterChainProxy is a great place to start.