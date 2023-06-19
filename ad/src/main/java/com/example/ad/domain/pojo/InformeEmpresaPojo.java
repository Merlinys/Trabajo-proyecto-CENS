package com.example.ad.domain.pojo;

import com.example.ad.persistance.entities.Evaluador;
import com.example.ad.persistance.entities.RepEmpresa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class InformeEmpresaPojo {
    private int idInforme;
    private int eficienciaEficacia;
    private int seguridadAsistencial;
    private int centroPaciente;
    private int interoperabilidad;
    private int pruebasUsuario;
    private int erroresUsuario;
    private int capacidadAprendizaje;
    private int accesibilidad;
    private int toleranciaFallos;
    private int capacidadRecuperacion;
    private int arquitectura;
    private int otrosAspectos;
    private int autenticacion;
    private int autorizacion;
    private int criptografia;
    private int gestionContrasenas;
    private int integridad;
    private int autenticidad;
    private int gestionRiesgo;
    private int documentacion;
    private double procesoClinico;
    private double compatibilidad;
    private double usabilidad;
    private double fiabilidad;
    private double seguridad;
    private RepEmpresa repRepEmpresa;
    private Evaluador evaluador;
}
