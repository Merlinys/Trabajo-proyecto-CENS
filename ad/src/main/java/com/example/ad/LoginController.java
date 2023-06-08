package com.example.ad;

import clases.rep_empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableJpaRepositories("com/example/ad/Repositorio")
@RestController
@EntityScan("clases.*")
public class LoginController {


    private rep_empresaDAOimpl.rep_empresaRepositorio empresaRepositorio;

    @Autowired
    public LoginController(rep_empresaDAOimpl.rep_empresaRepositorio empresaRepositorio) {
        this.empresaRepositorio = empresaRepositorio;
    }

    @PostMapping("/loginempresa")
    public String verificarLogin(@RequestParam String username, @RequestParam String password) {
        String rutEmpresa = username;
        String contraseña = password;

        rep_empresa empresa = empresaRepositorio.findByRutEmpresa(rutEmpresa)
                .orElse(null);

        if (empresa != null && empresa.getContraseña().equals(contraseña)) {
            return "Login exitoso";
        } else {
            return "Credenciales inválidas";
        }
    }
}
