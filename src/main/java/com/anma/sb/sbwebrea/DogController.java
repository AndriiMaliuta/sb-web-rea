package com.anma.sb.sbwebrea;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DogController {

    @GetMapping("/dogs")
    Flux<String> dogs() {

//        List<String> strings = new ArrayList<>();

        return Flux.create((fluxSink) -> {
            int counter = 0;
            String res = "[";
            do {
                fluxSink.next("{ \"value\": \"added " + counter + "\" },");
                counter++;
//                fluxSink.onRequest((r) -> System.out.println("Request initiated")).next(catBreed);
            } while (counter < 30);
            {
//                fluxSink.next("]");
                fluxSink.complete();
            }
        });

    }
}
