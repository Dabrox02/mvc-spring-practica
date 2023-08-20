package co.edu.uts.appdev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {
    @GetMapping({"/index", "/", "home", ""})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework");
        return "index.html";
    }
}
