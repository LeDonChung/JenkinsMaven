package vn.edu.iuh.fit.jenkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping
    public String home() {
        return "index";
    }
    @GetMapping("/cal")
    public Integer cal(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }
}
