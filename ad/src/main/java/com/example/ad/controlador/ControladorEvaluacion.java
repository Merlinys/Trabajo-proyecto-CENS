package com.example.ad.controlador;

import com.example.ad.domain.pojo.InformeEmpresaPojo;
import com.example.ad.domain.servicios.iServicioInformeEmpresa;
import lombok.RequiredArgsConstructor;
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

    @GetMapping("/inicio")
    public String test(Model model){

        return "evaluacion";
    }
    @PostMapping("/funcionaono")
    public ResponseEntity<InformeEmpresaPojo> save(@RequestBody InformeEmpresaPojo informeEmpresaPojonew){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(servicioInformeEmpresa.save(informeEmpresaPojonew));

        }catch (Exception a){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    }

