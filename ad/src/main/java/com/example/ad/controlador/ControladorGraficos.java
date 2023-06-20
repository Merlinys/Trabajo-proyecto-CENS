package com.example.ad.controlador;

import com.example.ad.domain.servicios.iEvaluadorServicio;
import com.example.ad.persistance.entities.Evaluador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControladorGraficos {

    @Autowired
    private iEvaluadorServicio evaluadorServicio;
    @GetMapping("/visualizarGraficos")
    public String crud(Model model){
        List<Evaluador> evaluadors =evaluadorServicio.listar();
        model.addAttribute("evaluadors",evaluadors);
        return "select_evalGraph";
    }

}
