package me.samoylenko.examples.vulnerable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class ViewController {

    @GetMapping("/view")
    public String getView(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
