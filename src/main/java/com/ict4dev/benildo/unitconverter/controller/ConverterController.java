package com.ict4dev.benildo.unitconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConverterController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/weight")
    public String Weight() {
        return "weight";
    }

    @GetMapping("/length")
    public String length() {
        return "length";
    }

    @GetMapping("/energy")
    public String energy() {
        return "energy";
    }

    @GetMapping("/speed")
    public String speed() {
        return "speed";
    }

    @GetMapping("/time")
    public String time() {
        return "time";
    }
}
