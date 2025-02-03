package com.dilan.pruebajwt.Demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
@AllArgsConstructor
public class DemoController {

    @GetMapping(value = "hola")
    public String hola() {
        return "Hola";
    }

    @PostMapping(value = "demo")
    public String login(){
        return "daslkfjald";
    }
}
