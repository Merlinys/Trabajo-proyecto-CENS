package com.example.ad.persistance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Usabilidad")
public class Usabilidad {

    @Id
    @Column(name = "id_usabilidad")
    private int idUsabilidad;

    @Column(name = "Prueba_usu")
    private Integer pruebaUsu;

    @Column(name = "Errores_usu")
    private Integer erroresUsu;

    @Column(name = "Capacidad_aprendizaje")
    private Integer capacidadAprendizaje;

    @Column(name = "accesibilidad")
    private Integer accesibilidad;

}