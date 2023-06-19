package com.example.ad.controlador;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.ad.persistance.CrudrepositorioEntity.IRepositorioRepEmpresaEntity;
import org.springframework.web.bind.annotation.RequestParam;

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
