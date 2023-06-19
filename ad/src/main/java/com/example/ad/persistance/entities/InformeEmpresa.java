package com.example.ad.persistance.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter

@Entity
@Table(name = "informe_empresa")
public class InformeEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_informe_empresa")
    private int idInformeEmpresa;

    @Column(name = "fecha_informe")
    private Date fechaInforme;

    @ManyToOne
    @JoinColumn(name = "fk_id_fiabilidad")
    private Fiabilidad fiabilidad;

    @ManyToOne
    @JoinColumn(name = "fk_id_usabilidad")
    private Usabilidad usabilidad;

    @ManyToOne
    @JoinColumn(name = "fk_id_compatibilidad")
    private Compatibilidad compatibilidad;

    @ManyToOne
    @JoinColumn(name = "fk_id_proceso_clinico")
    private ProcesoClinico procesoClinico;

    @ManyToOne
    @JoinColumn(name = "fk_id_seguridad")
    private Seguridad seguridad;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "fk_id_evaluador", referencedColumnName = "id_evaluador"),
            @JoinColumn(name = "fk_rut_empresa", referencedColumnName = "fk_rut_representantes")
    })
    private Evaluador evaluador;

    // Getters and setters

    public int getIdInformeEmpresa() {
        return idInformeEmpresa;
    }

    public void setIdInformeEmpresa(int idInformeEmpresa) {
        this.idInformeEmpresa = idInformeEmpresa;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public Fiabilidad getFiabilidad() {
        return fiabilidad;
    }

    public void setFiabilidad(Fiabilidad fiabilidad) {
        this.fiabilidad = fiabilidad;
    }

    public Usabilidad getUsabilidad() {
        return usabilidad;
    }

    public void setUsabilidad(Usabilidad usabilidad) {
        this.usabilidad = usabilidad;
    }

    public Compatibilidad getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(Compatibilidad compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    public ProcesoClinico getProcesoClinico() {
        return procesoClinico;
    }

    public void setProcesoClinico(ProcesoClinico procesoClinico) {
        this.procesoClinico = procesoClinico;
    }

    public Seguridad getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(Seguridad seguridad) {
        this.seguridad = seguridad;
    }

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }
}
