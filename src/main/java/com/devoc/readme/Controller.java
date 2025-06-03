package com.devoc.readme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("hello")
    public String index2() {
        return "Lae7";
    }

}
