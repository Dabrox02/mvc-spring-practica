package co.edu.uts.appdev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.uts.appdev.models.Usuario;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "/", "home", ""})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){
        model.addAttribute("titulo", "Perfil Usuario");
        Usuario usuario = new Usuario();
        usuario.setNombre("Jaider");
        usuario.setApellido("Mendoza");
        usuario.setEmail("jaider@gmail.com");
        model.addAttribute("usuario", usuario);
        return "perfil";
    }
}
