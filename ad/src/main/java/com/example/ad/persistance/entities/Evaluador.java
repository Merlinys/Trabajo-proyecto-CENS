package com.example.ad.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "evaluador")
public class Evaluador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluador")
    private int idEvaluador;

    @Column(name = "contraseña")
    private String contraseña;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_rut_representantes")
    private RepEmpresa repRepEmpresa;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nro_contacto")
    private String nroContacto;

    @Column(name = "rol")
    private String rol;


    public Evaluador() {
    }

    public Evaluador(int idEvaluador, String contraseña, RepEmpresa repRepEmpresa, String nombre, String nroContacto, String rol) {
        this.idEvaluador = idEvaluador;
        this.contraseña = contraseña;
        this.repRepEmpresa = repRepEmpresa;
        this.nombre = nombre;
        this.nroContacto = nroContacto;
        this.rol = rol;
    }
}