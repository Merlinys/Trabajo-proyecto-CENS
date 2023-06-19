package com.example.ad.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "Compatibilidad")
public class Compatibilidad {

    @Id
    @Column(name = "id_compatibilidad")
    private int idCompatibilidad;

    @Column(name = "interoperabilidad")
    private Integer interoperabilidad;

}