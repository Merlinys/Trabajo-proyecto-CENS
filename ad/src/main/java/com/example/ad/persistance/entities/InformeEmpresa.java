package com.example.ad.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "informeempresa")
public class InformeEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idInforme")
    private int idInforme;

    @Column(name = "Eficiencia y eficacia")
    private int eficienciaEficacia;

    @Column(name = "Seguridad Asistencial")
    private int seguridadAsistencial;

    @Column(name = "Registro clinico")
    private int registroClinico;

    @Column(name = "Centro en el paciente")
    private int centroPaciente;

    @Column(name = "Interoperabilidad")
    private int interoperabilidad;

    @Column(name = "Pruebas de usuario")
    private int pruebasUsuario;

    @Column(name = "Errores de usuario")
    private int erroresUsuario;

    @Column(name = "Capacidad de aprendizaje")
    private int capacidadAprendizaje;

    @Column(name = "Accesibilidad")
    private int accesibilidad;

    @Column(name = "Tolerancia a fallos")
    private int toleranciaFallos;

    @Column(name = "Capacidad de recuperación")
    private int capacidadRecuperacion;

    @Column(name = "Arquitectura")
    private int arquitectura;

    @Column(name = "Otros aspectos")
    private int otrosAspectos;

    @Column(name = "Autenticación")
    private int autenticacion;

    @Column(name = "Autorización")
    private int autorizacion;

    @Column(name = "Criptografía")
    private int criptografia;

    @Column(name = "Gestión contraseñas")
    private int gestionContrasenas;

    @Column(name = "Integridad")
    private int integridad;

    @Column(name = "Autenticidad")
    private int autenticidad;

    @Column(name = "Gestión de riesgo")
    private int gestionRiesgo;

    @Column(name = "Documentación")
    private int documentacion;

    @Column(name = "Eficiencia de desempeño")
    private int eficienciaDeDesempeño;

    @Column(name = "Proceso Clinico")
    private double procesoClinico;

    @Column(name = "Compatibilidad")
    private double compatibilidad;

    @Column(name = "Usabilidad")
    private double usabilidad;

    @Column(name = "Fiabilidad")
    private double fiabilidad;

    @Column(name = "Seguridad")
    private double seguridad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_rut_representantes")
    private RepEmpresa repRepEmpresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_evaluador")
    private Evaluador evaluador;

    public InformeEmpresa() {
    }

    public InformeEmpresa(int idInforme, int eficienciaEficacia, int seguridadAsistencial, int centroPaciente, int interoperabilidad, int pruebasUsuario, int erroresUsuario, int capacidadAprendizaje, int accesibilidad, int toleranciaFallos, int capacidadRecuperacion, int arquitectura, int otrosAspectos, int autenticacion, int autorizacion, int criptografia, int gestionContrasenas, int integridad, int autenticidad,
                          int gestionRiesgo, int documentacion, double procesoClinico, double compatibilidad, double usabilidad, double fiabilidad,int registroClinico,
                          double seguridad, RepEmpresa repRepEmpresa, Evaluador evaluador) {
        this.idInforme = idInforme;
        this.eficienciaEficacia = eficienciaEficacia;
        this.seguridadAsistencial = seguridadAsistencial;
        this.centroPaciente = centroPaciente;
        this.interoperabilidad = interoperabilidad;
        this.pruebasUsuario = pruebasUsuario;
        this.erroresUsuario = erroresUsuario;
        this.capacidadAprendizaje = capacidadAprendizaje;
        this.accesibilidad = accesibilidad;
        this.toleranciaFallos = toleranciaFallos;
        this.capacidadRecuperacion = capacidadRecuperacion;
        this.arquitectura = arquitectura;
        this.otrosAspectos = otrosAspectos;
        this.autenticacion = autenticacion;
        this.autorizacion = autorizacion;
        this.criptografia = criptografia;
        this.gestionContrasenas = gestionContrasenas;
        this.integridad = integridad;
        this.autenticidad = autenticidad;
        this.gestionRiesgo = gestionRiesgo;
        this.documentacion = documentacion;
        this.procesoClinico = procesoClinico;
        this.compatibilidad = compatibilidad;
        this.usabilidad = usabilidad;
        this.fiabilidad = fiabilidad;
        this.seguridad = seguridad;
        this.repRepEmpresa = repRepEmpresa;
        this.evaluador = evaluador;
        this.registroClinico = registroClinico;
    }
}