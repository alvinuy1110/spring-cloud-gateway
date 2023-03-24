Spring Cloud Gateway
====================

This is a Reactive application using Netty as the container

# Useful URLs

## show the routes
```
http://localhost:8080/actuator/gateway/routes
```

## show global filters
These are special filters that are conditionally applied to all routes.

```
http://localhost:8080/actuator/gateway/globalfilters
```
* the order of filters

## show route filters
```
http://localhost:8080/actuator/gateway/routefilters
```

## show a specific route
```
http://localhost:8080/actuator/gateway/routes/{route_id}
```

# Logging

## Log levels
```
org.springframework.cloud.gateway
org.springframework.http.server.reactive
org.springframework.web.reactive
org.springframework.boot.autoconfigure.web
reactor.netty
redisratelimiter
```

## Wiretap

Enable either or all:
spring.cloud.gateway.httpserver.wiretap=true or spring.cloud.gateway.httpclient.wiretap=true

# Configuration

https://cloud.spring.io/spring-cloud-gateway/reference/html/appendix.html

# Reference
* https://cloud.spring.io/spring-cloud-gateway/reference/html/
* https://medium.com/bliblidotcom-techblog/spring-cloud-gateway-and-its-resilience-7ccf3d3b4f7c
