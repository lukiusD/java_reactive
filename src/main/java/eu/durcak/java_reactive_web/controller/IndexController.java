package eu.durcak.java_reactive_web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;

import static java.time.temporal.ChronoField.*;

@RestController
public class IndexController {

    @GetMapping(path="/time", produces= MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> getTime() {
        // Vráti aktuálny čas ako reaktívny Mono
        return Mono.just(LocalDateTime.now().toString());
    }

    @GetMapping(path="/json-time", produces= MediaType.APPLICATION_JSON_VALUE)
    public Mono<TimeData> getJsonTime() {
        // Vráti aktuálny čas ako reaktívny Mono

        DateTimeFormatter dateFormat = new DateTimeFormatterBuilder()
                .appendValue(DAY_OF_MONTH, 2)
                .appendLiteral('.')
                .appendValue(MONTH_OF_YEAR, 2)
                .appendLiteral('.')
                .appendValue(YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
                .toFormatter();

        return Mono.just(new TimeData(LocalDateTime.now().format(dateFormat).toString()));
    }

    public record TimeData(String time){}
}


