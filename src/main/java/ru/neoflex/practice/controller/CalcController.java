package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CalcController {

    @GetMapping("/plus/{a}/{b}")
    public Integer plus(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer minus(@PathVariable Integer a, @PathVariable Integer b) {
        return a - b;
    }
}