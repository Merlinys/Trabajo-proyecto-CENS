package com.example.ad.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    // simplemente es para llamar al index , la ultima vez que probe la pagina sin esto no cargaba el index asi que dejo la funciona aqui por si acaso
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
