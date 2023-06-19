package com.example.ad.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Seguridad")
public class Seguridad {

    @Id
    @Column(name = "id_seguridad")
    private int idSeguridad;

    @Column(name = "autenticacion")
    private Integer autenticacion;

    @Column(name = "autorizacion")
    private Integer autorizacion;

    @Column(name = "criptografia")
    private Integer criptografia;

    @Column(name = "gestion_contraseñas")
    private Integer gestionContrasenas;

    @Column(name = "integridad")
    private Integer integridad;

    @Column(name = "autenticidad")
    private Integer autenticidad;

    @Column(name = "gestion_de_riesgo")
    private Integer gestionRiesgo;

    @Column(name = "documentacion")
    private Integer documentacion;
}