package stud.kea.dk.scrapbasketsultimateproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    // http://localhost:8080/
    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}


