package com.example.ad.Controladores;


import com.example.ad.Servicio.rep_EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class rep_EmpresaControlador {

    @Autowired
    private rep_EmpresaServicio servicio;

    @GetMapping("/empresaRep")
    public String empresaRep(Model model) {

        return "inicioSesionEMP";
    }
}
