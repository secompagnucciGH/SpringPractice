package com.practicaSpring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @GetMapping("/PathVariable/{name}") // parametro dinamico
    public String prueba2(@PathVariable String name) {
        // end point de pathvairable indicamos que
        // el parametro vaa venir en la url
        return "Hola, " + name;
    }
}
