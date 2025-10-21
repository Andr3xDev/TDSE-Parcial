package edu.tdse.parcial.math.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping()
    public Greeting greeting(@RequestParam(value = "value") String value) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}