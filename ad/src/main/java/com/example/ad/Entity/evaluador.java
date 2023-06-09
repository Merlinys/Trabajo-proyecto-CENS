package clases;

import javax.persistence.*;

//Clase que representa la clase evaluador de la bdd

@Entity
@Table(name = "evaluador")
public class evaluador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluador")
    private int id_evaluador;

    @Column(name = "contraseña")
    private String contraseña;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_rut_representantes")
    private rep_Empresa repRepEmpresa;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nro_contacto")
    private String nroContacto;

    @Column(name = "rol")
    private String rol;


    public evaluador() {
    }

    public evaluador(int id_evaluador,String contraseña) {
        this.id_evaluador = id_evaluador;
        this.contraseña = contraseña;
        this.repRepEmpresa = repRepEmpresa;
        this.nombre = nombre;
        this.nroContacto = nroContacto;
        this.rol = rol;
    }

    public int getIdEvaluador() {
        return id_evaluador;
    }

    public void setIdEvaluador(int idEvaluador) {
        this.id_evaluador = idEvaluador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public rep_Empresa getRepEmpresa() {
        return repRepEmpresa;
    }

    public void setRepEmpresa(rep_Empresa repRepEmpresa) {
        this.repRepEmpresa = repRepEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroContacto() {
        return nroContacto;
    }

    public void setNroContacto(String nroContacto) {
        this.nroContacto = nroContacto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}

