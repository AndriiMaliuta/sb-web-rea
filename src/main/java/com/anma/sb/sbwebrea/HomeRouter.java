package com.anma.sb.sbwebrea;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class HomeRouter {

    @Bean
    public RouterFunction<ServerResponse> handle(HomeHandler homeHandler) {

        return RouterFunctions
                .route(GET("/home")
                .and(accept(MediaType.TEXT_HTML)), homeHandler::home);
    }
}