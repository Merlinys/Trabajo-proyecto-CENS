package com.example.ad.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controladortesteo {
    @GetMapping("/inicio")
    public String test(Model model){
        return "evaluacion";
    }

}
