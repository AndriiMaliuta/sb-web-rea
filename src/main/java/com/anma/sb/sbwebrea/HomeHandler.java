package com.anma.sb.sbwebrea;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HomeHandler {

    public Mono<ServerResponse> home(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_HTML)
                .body(BodyInserters.fromValue("Test Handler"));
    }
}
