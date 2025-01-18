package eu.durcak.java_reactive_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperimentController {

    @GetMapping("/experimental")
    public String experiment(){
        return "Hello Motto";
   }
}
