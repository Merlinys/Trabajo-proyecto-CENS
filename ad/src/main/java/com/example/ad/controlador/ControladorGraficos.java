package com.example.ad.controlador;

import com.example.ad.domain.servicios.IRepEmpresaServicio;
import com.example.ad.domain.servicios.iEvaluadorServicio;
import com.example.ad.persistance.entities.Evaluador;
import com.example.ad.persistance.entities.RepEmpresa;
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
    public String opcion(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "select_evalGraph";
    }
    @GetMapping("/verGraficos")
    public String verGraficos(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "graphs";
    }
    @GetMapping("/verGraficos2")
    public String verGraficos2(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "graphs2";
    }

}
