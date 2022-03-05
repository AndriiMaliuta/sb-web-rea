package com.anma.sb.sbwebrea;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class HomeClient {

    private final WebClient client;

    public HomeClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8080").build();
    }

    public Mono<String> getHome() {
        return this.client.get()
                .uri("/home").accept(MediaType.TEXT_HTML)
                .retrieve()
                .bodyToMono(String.class);
    }



}
