package com.example.ad.controlador;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class OpcionesEvaluador {
    @PostMapping("/evaluarEmpresa")
    public String opcion(Model model){

        return "selec_evalEMP";
    }
}
