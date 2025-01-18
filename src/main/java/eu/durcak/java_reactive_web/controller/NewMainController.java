package eu.durcak.java_reactive_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Controller
public class NewMainController {

    @PostMapping("/submit")
    public String exex(@RequestBody Map<String, Object> postRequestData,
                       @RequestHeader(value = "X-author", required = false) String author){
        return "This is the new Main Controller";
    }
}
