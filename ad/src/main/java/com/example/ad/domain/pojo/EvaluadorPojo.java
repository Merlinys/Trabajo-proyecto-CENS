package com.example.ad.domain.pojo;

import com.example.ad.persistance.entities.RepEmpresa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EvaluadorPojo {

    private int idEvaluador;
    private String contraseña;
    private RepEmpresa repRepEmpresa;
    private String nombre;
    private String nroContacto;
    private String rol;
}
