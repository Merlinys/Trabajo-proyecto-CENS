package com.example.ad.controlador;

import com.example.ad.domain.pojo.InformeEmpresaPojo;
import com.example.ad.domain.servicios.iEvaluadorServicio;
import com.example.ad.domain.servicios.iServicioInformeEmpresa;
import com.example.ad.persistance.entities.Evaluador;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping()
public class ControladorEvaluacion {

    private final iServicioInformeEmpresa servicioInformeEmpresa;
    @Autowired
    private iEvaluadorServicio evaluadorServicio;

    @GetMapping("/verEvaluacion1")
    public String evalua1(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "evaluacion";
    }
    @GetMapping("/verEvaluacion2")
    public String evalua(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "evaluacion2.1";
    }

    @GetMapping("/vuelta")
    public String vuelta(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "selec_evalEMP";
    }
    }

