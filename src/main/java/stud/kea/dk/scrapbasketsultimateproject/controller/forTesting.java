package stud.kea.dk.scrapbasketsultimateproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class forTesting {
    // http://localhost:8080/Testing
    @GetMapping("/Testing")
    public String forTesting() {
        return "designTesting";
    }
}
