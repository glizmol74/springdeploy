package com.glizmol.springdeploy;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
@RestController
public class SaludosController {

    @Value("${app.message}")
    String message;

    @Value("${app.varexample}")
    String message2;

    @GetMapping("/saludo")
    public String saludos() {

        System.out.println(message + " " + message2);
        return "Hola que tal desde Spring";


    }
}
