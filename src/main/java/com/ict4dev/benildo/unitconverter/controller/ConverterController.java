package com.ict4dev.benildo.unitconverter.controller;

import com.ict4dev.benildo.unitconverter.service.*;
import org.springframework.ui.Model;
import com.ict4dev.benildo.unitconverter.model.Unit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/weight")
    public String weight(@ModelAttribute Unit unit, Model model) {
        String result = WeightService.convertWeight(unit);
        model.addAttribute("result", result);
        return "weight";
    }

    @GetMapping("/length")
    public String length() {
        return "length";
    }

    @PostMapping("/length")
    public String length(@ModelAttribute Unit unit, Model model) {
        String result = LengthService.convertLength(unit);
        model.addAttribute("result", result);
        return "length";
    }

    @GetMapping("/temperature")
    public String temperature() {
        return "temperature";
    }

    @PostMapping("/temperature")
    public String temperature(@ModelAttribute Unit unit, Model model) {
        String result = TemperatureService.convertTemperature(unit);
        model.addAttribute("result", result);
        return "temperature";
    }


    @GetMapping("/speed")
    public String speed() {
        return "speed";
    }

    @PostMapping("/speed")
    public String speed(@ModelAttribute Unit unit, Model model) {
        String result = SpeedService.convertSpeed(unit);
        model.addAttribute("result", result);
        return "speed";
    }

    @GetMapping("/time")
    public String time() {
        return "time";
    }
    @PostMapping("/time")
    public String time(@ModelAttribute Unit unit, Model model) {
        String result = TimeService.convertTime(unit);
        model.addAttribute("result", result);
        return "time";
    }
}
