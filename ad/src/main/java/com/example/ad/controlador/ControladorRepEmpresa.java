package com.example.ad.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorRepEmpresa {
    @GetMapping("/subirnda")
    public String descarga(Model model){
        return "subirArch";
    }
}
