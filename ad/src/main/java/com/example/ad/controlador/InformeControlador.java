package com.example.ad.controlador;

import com.example.ad.domain.pojo.InformeEmpresaPojo;
import com.example.ad.domain.servicios.iServicioInformeEmpresa;
import com.example.ad.persistance.entities.InformeEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas-coches")
@RequiredArgsConstructor
public class InformeControlador {

    private final iServicioInformeEmpresa servicioInformeEmpresa;

    @GetMapping()
    public ResponseEntity<List<InformeEmpresaPojo>> getAll(){
     return ResponseEntity.ok(servicioInformeEmpresa.getAll());
    }


    @GetMapping(path= "/{id}")
    public ResponseEntity<InformeEmpresaPojo> getIdInforme(Integer id){
        return ResponseEntity.of(servicioInformeEmpresa.getidInforme(id));
    }

    @PostMapping()
    public ResponseEntity<InformeEmpresaPojo> save(@RequestBody InformeEmpresaPojo informeEmpresaPojonew){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(servicioInformeEmpresa.save(informeEmpresaPojonew));

        }catch (Exception a){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
