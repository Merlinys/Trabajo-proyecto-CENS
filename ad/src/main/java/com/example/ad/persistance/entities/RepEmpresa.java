package com.example.ad.persistance.entities;


//Clase que representa la clase rep_empresa de la bdd

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "rep_empresa")
public class RepEmpresa {

    @Id
    @Column(name = "rut_empresa", length = 50)
    private String rutEmpresa;

    @Column(name = "contraseña", length = 50)
    private String contrasena;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "nro_contacto")
    private int nroContacto;

    @Column(name = "nombre_empresa", length = 45)
    private String nombreEmpresa;

    @Column(name = "rut", length = 45)
    private String rut;
    // constructor vacío
    public RepEmpresa() {
    }

    // constructor con parámetros
    public RepEmpresa(String rutEmpresa, String contraseña, String nombre, int nroContacto, String nombreEmpresa,String rut) {
        this.rutEmpresa = rutEmpresa;
        this.contrasena = contraseña;
        this.nombre = nombre;
        this.nroContacto = nroContacto;
        this.nombreEmpresa = nombreEmpresa;
        this.rut = rut;

    }


}
