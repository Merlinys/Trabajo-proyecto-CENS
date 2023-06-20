package com.example.ad.controlador;

import com.example.ad.domain.servicios.IRepEmpresaServicio;
import com.example.ad.persistance.entities.RepEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class OpcionesEvaluador {



    private IRepEmpresaServicio repEmpresaServicio;

    @Autowired
    public OpcionesEvaluador(IRepEmpresaServicio repEmpresaServicio) {
        this.repEmpresaServicio = repEmpresaServicio;
    }


    @GetMapping("/evaluarEmpresa")
    public String opcion(Model model){
        List<RepEmpresa> empresas = repEmpresaServicio.listar();
        model.addAttribute("empresas",empresas);
        return "selec_evalEMP";
    }
}
