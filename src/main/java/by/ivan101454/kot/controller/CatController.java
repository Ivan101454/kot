package by.ivan101454.kot.controller;

import by.ivan101454.kot.dto.Cat;
import by.ivan101454.kot.enums.Color;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cats")
public class CatController {
    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("cat1", new Cat("Ирисольда", 5, Color.BRAWN));
        model.addAttribute("cat2", new Cat("Дымон", 5, Color.GREY));
        return "cats";
    }
}
