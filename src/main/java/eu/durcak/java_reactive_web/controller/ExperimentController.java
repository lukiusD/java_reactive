package eu.durcak.java_reactive_web.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ExperimentController {

    @GetMapping("/experimental")
    public String experiment(){
        return "Hello Motto";
   }
}
