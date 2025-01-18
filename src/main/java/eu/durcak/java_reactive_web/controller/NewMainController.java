package eu.durcak.java_reactive_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class NewMainController {

    @PostMapping("/submit")
    public String exex(@RequestBody Map<String, Object> postRequestData){
        return "This is the new Main Controller";
    }
}
