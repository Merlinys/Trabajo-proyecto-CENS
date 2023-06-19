package com.example.ad.controlador;

import com.example.ad.persistance.CrudrepositorioEntity.IRepositorioEvaluadorEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class LoginEvaluador {
    private final IRepositorioEvaluadorEntity iRepositorioEvaluadorEntity;

    @PostMapping("/LoginEvaluador")
    public String login(@RequestParam(value = "IdEvaluador") Integer id, @RequestParam(value = "pass") String pass) {
        if ((iRepositorioEvaluadorEntity.findByIdEvaluadorAndContraseña(id,pass)).isPresent()){
            return "optEVAL";
        }
        else{
            return "inicioSesionEVAL";
        }
    }
}