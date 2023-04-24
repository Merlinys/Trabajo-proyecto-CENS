package control;

import clases.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repositorios.Empresarepo;

@Controller
public class empresacontrol {

    @Autowired
    private Empresarepo empresaRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    public interface Empresarepo extends JpaRepository<Empresa, Long> {
        Empresa findByRutEmpresaAndContraseña(String rutEmpresa, String contraseña);

        Empresa findByRutEmpresaAndContrasena(String rutEmpresa, String contraseña);
    }
    @PostMapping("/login")
    public String login(@RequestParam("rutEmpresa") String rutEmpresa, @RequestParam("contraseña") String contraseña, Model model) {
        // buscar la empresa en la base de datos
        Empresa empresa = empresaRepository.findByRutEmpresaAndContrasena(rutEmpresa, contraseña);
        if (empresa != null) {
            // si la empresa existe, redireccionar a otpEMPR
            return "otpEMPR";
        } else {
            // si la empresa no existe, mostrar un mensaje de error
            model.addAttribute("mensaje", "Credenciales inválidas. Por favor, intente nuevamente.");
            return "index";
        }
    }
}
