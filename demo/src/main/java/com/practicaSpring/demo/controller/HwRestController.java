package com.practicaSpring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HwRestController {

    @GetMapping("/RestController") // ruta para acceder al metodo.
    public String prueba1() {
        return "Prueba de impresión #1"; // retorno del metodo
    }
}
