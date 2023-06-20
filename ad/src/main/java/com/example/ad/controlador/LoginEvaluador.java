package com.example.ad.controlador;

import com.example.ad.domain.servicios.EvaluadorServicio;
import com.example.ad.domain.servicios.iEvaluadorServicio;
import com.example.ad.persistance.CrudrepositorioEntity.IRepositorioEvaluadorEntity;
import com.example.ad.persistance.entities.Evaluador;
import com.example.ad.persistance.entities.RepEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class LoginEvaluador {
    private final IRepositorioEvaluadorEntity iRepositorioEvaluadorEntity;
    @Autowired
    private final iEvaluadorServicio evaluadorServicio;

    @PostMapping("/LoginEvaluador")
    public String login(@RequestParam(value = "IdEvaluador") Integer id, @RequestParam(value = "pass") String pass, Model model) {
        if ((iRepositorioEvaluadorEntity.findByIdEvaluadorAndContraseña(id,pass)).isPresent()){
            List<Evaluador> empresas = evaluadorServicio.listar();
            model.addAttribute("empresas",empresas);
            return "optEVAL";
        }
        else{
            return "inicioSesionEVAL";
        }
    }
}