package com.example.ad.Servicio;

import com.example.ad.Repositorio.rep_EmpresaRepositorio;
import com.example.ad.Entity.rep_Empresa;
import com.example.ad.Servicio.rep_EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rep_EmpresaServicioImplementacion implements rep_EmpresaServicio {

    @Autowired
    private rep_EmpresaRepositorio repositorio;
    @Override
    public List<rep_Empresa> listarTodasLasEmpresas() {

        return repositorio.findAll();
    }
}
