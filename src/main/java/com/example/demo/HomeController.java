package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller

public class HomeController {
    @GetMapping("/car")
    public String loadCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "car";
    }


    @PostMapping("/car")
    public String processCar(@Valid Car car, BindingResult result) {
        if (result.hasErrors()) {
            return "car";
        }
         return "carconfirm";
    }

}