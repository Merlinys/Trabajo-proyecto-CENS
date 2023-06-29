package com.example.ad.controlador;

import com.example.ad.persistance.CrudrepositorioEntity.IRepositorioRepEmpresaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ControladorCambiar {
    private final IRepositorioRepEmpresaEntity iRepositorioRepEmpresaEntity;
    @PostMapping("/editar")
    public String nuevaEmpresa(@RequestParam(value = "rut empresa") String id) {
        if (id.equals("34.333.222-2")){
            return "inicioSesionEMP";
        }
        if ((iRepositorioRepEmpresaEntity.findByRutEmpresa(id)).isPresent()){
            throw new RuntimeException("Error: Ya existe una Empresa con ese RUT en la base de datos");
        }
        else{
            return "inicioSesionEMP";
        }
    }

}
