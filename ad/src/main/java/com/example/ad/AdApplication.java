package com.example.ad;


import clases.rep_empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages ={"com.example.ad.*"})
@Controller
@EntityScan("clases")
public class AdApplication {

    @Autowired
    private rep_empresaDAOimpl.rep_empresaRepositorio empresaRepositorio;
    public static void main(String[] args) {
        SpringApplication.run(AdApplication.class, args);
    }

    //pagina princiapl
    @RequestMapping("/")
    public String home() {

        return "index";
    }

    //CENS
    //boton dirigirse a login evaluador
    @GetMapping("/evel")
    public String evel(Model model) {

        return "inicioSesionEVAL";
    }
    // login evaluador

    //@GetMapping("/loginCens")
    public String ISEVAL(Model model){

        return "optEVAL";
    }

    @GetMapping("/visualresultados")
    public String VRC(Model model){

        return "selec_evalEMP";
    }

    @GetMapping("/EvaluarEmpresa")
    public String EE(Model model){

        return "select_evalGraph";
    }




    //Representante Empresa acciones

    //boton representante empresa

    @GetMapping("/empresaRep")
    public String empresaRep(Model model) {

        return "inicioSesionEMP";
    }
    @GetMapping("/cerrarrep")
    public String cerrarRep(Model model){
        return "inicioSesionEMP";
    }

    //direccion perfil represante empresa
    @GetMapping("/perfilemp")
    public String perfilrep(Model model){

        return "profileEMPR";
    }
    // subir nda
    @GetMapping("/subirnda")
    public String subirnda(Model model){

        return "subirArch";
    }
    //falta el visualizar resultados y el ver seguimiento


    @Service
    public static class rep_empresaServicioImplementacion implements rep_empresaDAOimpl.rep_empresaServicio {

        private rep_empresaDAOimpl.rep_empresaRepositorio empresaRepositorio;

        @Autowired
        public rep_empresaServicioImplementacion(rep_empresaDAOimpl.rep_empresaRepositorio empresaRepositorio) {
            this.empresaRepositorio = empresaRepositorio;
        }

        @Override
        public rep_empresa iniciarSesion(String rutEmpresa, String contraseña) {
            return empresaRepositorio.findByRutEmpresaAndContraseña(rutEmpresa, contraseña);
        }
    }

    public static class rep_empresaDTO {

        private String rutEmpresa;
        private String contraseña;
        private String nombre;
        private int nroContacto;
        private String nombreEmpresa;

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

        public rep_empresaDTO() {
        }

        public rep_empresaDTO(String rutEmpresa,String nombre,String nombreEmpresa,int nroContacto,String contraseña) {
            this.rutEmpresa = rutEmpresa;
            this.contraseña = contraseña;
            this.nombreEmpresa = nombreEmpresa;
            this.nombre = nombre;
            this.nroContacto = nroContacto;
        }
    }
}
