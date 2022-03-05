package com.anma.sb.sbwebrea;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DogController {

    @GetMapping("/dogs")
    Flux<String> dogs() {

//        List<String> strings = new ArrayList<>();

        return Flux.create((fluxSink) -> {
            int counter = 0;
            String res = "";
            do {
                fluxSink.next("added " + counter);
                counter++;
//                fluxSink.onRequest((r) -> System.out.println("Request initiated")).next(catBreed);
            } while (counter < 30);
            {
                fluxSink.complete();
            }
        });

    }
}
