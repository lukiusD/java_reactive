package eu.durcak.java_reactive_web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
public class IndexController {

        @GetMapping(path="/time", produces= MediaType.APPLICATION_JSON_VALUE)
        public Mono<String> getTime() {
            // Vráti aktuálny čas ako reaktívny Mono
            return Mono.just(LocalDateTime.now().toString());
        }
}
