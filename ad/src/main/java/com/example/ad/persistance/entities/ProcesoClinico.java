package com.example.ad.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "proceso_clinico")
public class ProcesoClinico {

    @Id
    @Column(name = "id_proceso_clinico")
    private int idProcesoClinico;

    @Column(name = "eficiencia_eficacia")
    private int eficienciaEficacia;

    @Column(name = "seguridad_asistencial")
    private Integer seguridadAsistencial;

    @Column(name = "centro_paciente")
    private Integer centroPaciente;

    @Column(name = "registro_clinico")
    private Integer registroClinico;
}