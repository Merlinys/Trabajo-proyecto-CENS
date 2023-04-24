package controladores;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication

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

    @GetMapping("/inputise")
    public String ISEMP(Model model){
        return "optEMPR";
    }

    @GetMapping("/ieeval")
    public String ISEVAL(Model model){
        return "optEVAL";
    }



}
