package com.example.ad.controlador;

import com.example.ad.persistance.entities.RepEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.ad.domain.repositorioEntity.IRepositorioRepEmpresaEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class LoginRepEmpresa {
    private final IRepositorioRepEmpresaEntity iRepositorioRepEmpresaEntity;

    @PostMapping("/loginempresa")
    public String login(@RequestParam(value = "username") String id, @RequestParam(value = "pass") String pass) {
        if ((iRepositorioRepEmpresaEntity.findByRutEmpresaAndContrasena(id,pass)).isPresent()){
            return "optEMPR";
        }
        else{
            return "inicioSesionEMP";
        }
    }
}
