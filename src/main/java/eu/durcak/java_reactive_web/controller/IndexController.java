package eu.durcak.java_reactive_web.controller;

import ch.qos.logback.core.joran.sanity.Pair;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class IndexController {

        @GetMapping(path="/time", produces= MediaType.APPLICATION_JSON_VALUE)
        public Mono<String> getTime() {
            // Vráti aktuálny čas ako reaktívny Mono
            return Mono.just(LocalDateTime.now().toString());
        }

    @GetMapping(path="/json-time", produces= MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> getJsonTime() {
        // Vráti aktuálny čas ako reaktívny Mono
        return Mono.just(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE).toString());
    }
}
