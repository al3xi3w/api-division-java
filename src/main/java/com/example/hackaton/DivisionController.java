package com.example.hackaton;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DivisionController {

    @GetMapping("/dividir")
    public double dividir(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero 😱");
        }
        return a / b;
    }
}

