package com.example.ad.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Fiabilidad")
public class Fiabilidad {

    @Id
    @Column(name = "id_fiabilidad")
    private int idFiabilidad;

    @Column(name = "eficiencia_desempeño")
    private Integer eficienciaDesempeno;

    @Column(name = "tolerancia_a_fallos")
    private Integer toleranciaFallos;

    @Column(name = "capacidad_de_recuperacion")
    private Integer capacidadRecuperacion;

    @Column(name = "arquitectura")
    private Integer arquitectura;

    @Column(name = "otros_aspectos")
    private Integer otrosAspectos;
}