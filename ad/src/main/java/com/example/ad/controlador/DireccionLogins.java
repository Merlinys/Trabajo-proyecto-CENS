package com.example.ad.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DireccionLogins {

    //Login para el evaluador Cens
    @GetMapping("/loginEvaluador")
    public String loginEvaluador(Model model){
        return "inicioSesionEVAL";
    }

    //login para el representante de la empresa
    @GetMapping("/loginEmpresa")
    public String loginRepEmpresa(Model model){
        return "inicioSesionEMP";
    }


}
