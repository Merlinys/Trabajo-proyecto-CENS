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

//Controlador que maneja las opciones del evaluador

@Controller
public class OpcionesEvaluador {

    @Autowired
    private iEvaluadorServicio evaluadorServicio;

    //maneja la parte para seleccionar las empresas para evaluar , tambien maneja como funciona el crud.
    @GetMapping("/evaluarEmpresa")
    public String opcion(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "selec_evalEMP";
    }

    @GetMapping("/Seguimiento")
    public String seguir(Model model){
        List<Evaluador> evaluadors = evaluadorServicio.listar();
        model.addAttribute("empresas",evaluadors);
        return "TrazabilidadEva";
    }

    @GetMapping("/Perfileval")
    public String lll(Model model){
        return "profileEVAL";
    }
}
