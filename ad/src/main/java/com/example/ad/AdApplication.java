package com.example.ad;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import clases.*;
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
    @RequestMapping("/")
    public String home() {

        return "index";
    }

    @GetMapping("/empresaRep")
    public String empresaRep(Model model) {

        return "inicioSesionEMP";
    }

    @GetMapping("/evel")
    public String evel(Model model) {

        return "inicioSesionEVAL";
    }

    @GetMapping("/ieeval")
    public String ISEVAL(Model model){

        return "optEVAL";
    }

    @GetMapping("/loginempresa")
    public String logEM(Model model){

        return "optEMPR";
    }




}
