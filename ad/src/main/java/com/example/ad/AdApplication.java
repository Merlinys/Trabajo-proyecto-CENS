package com.example.ad;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import clases.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import repo.Empresarepo;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@ComponentScan(basePackages ={"com.example.ad"})
@EnableJpaRepositories(basePackages = "com.example.demo.repositories")
@EntityScan(basePackages = "com.example.demo.entities")
@Controller
public class AdApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdApplication.class, args);
    }

    //pagina princiapl
    @RequestMapping("/")
    public String home() {

        return "index";
    }
    //boton representante empresa
    @GetMapping("/empresaRep")
    public String empresaRep(Model model) {

        return "inicioSesionEMP";
    }
    //boton evaluador
    @GetMapping("/evel")
    public String evel(Model model) {

        return "inicioSesionEVAL";
    }
    // login evaluador
    @GetMapping("/ieeval")
    public String ISEVAL(Model model){

        return "optEVAL";
    }


    //Representante Empresa acciones

    @GetMapping("/cerrarrep")
    public String cerrarRep(Model model){
        return "inicioSesionEMP";
    }
    @GetMapping("/loginempresa")
    public String opempr(Model model){

        return "optEMPR";
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



}
