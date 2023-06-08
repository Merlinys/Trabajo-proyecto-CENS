package clases;


//Clase que representa la clase rep_empresa de la bdd
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rep_empresa")
public class rep_empresa {

    @Id
    @Column(name = "rut_empresa", length = 50)
    private String rutEmpresa;

    @Column(name = "contraseña", length = 50)
    private String contraseña;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "nro_contacto")
    private int nroContacto;

    @Column(name = "nombre_empresa", length = 45)
    private String nombreEmpresa;

    // constructor vacío
    public rep_empresa() {
    }

    // constructor con parámetros
    public rep_empresa(String rutEmpresa, String contraseña, String nombre, int nroContacto, String nombreEmpresa) {
        this.rutEmpresa = rutEmpresa;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.nroContacto = nroContacto;
        this.nombreEmpresa = nombreEmpresa;
    }

    // getters y setters
    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroContacto() {
        return nroContacto;
    }

    public void setNroContacto(int nroContacto) {
        this.nroContacto = nroContacto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
