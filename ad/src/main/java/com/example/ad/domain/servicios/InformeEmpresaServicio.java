package com.example.ad.domain.servicios;

import com.example.ad.domain.pojo.InformeEmpresaPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.example.ad.domain.Repositorio.iRepositorioInformeEmpresa;

@RequiredArgsConstructor
@Service
public class InformeEmpresaServicio implements iServicioInformeEmpresa{

    private final iRepositorioInformeEmpresa RepositorioInformeEmpresa;

    @Override
    public List<InformeEmpresaPojo> getAll() {
        return RepositorioInformeEmpresa.getAll();
    }

    @Override
    public Optional<InformeEmpresaPojo> getidInforme(Integer id) {
        return RepositorioInformeEmpresa.getidInforme(id);
    }


    @Override
    public InformeEmpresaPojo save(InformeEmpresaPojo newinformeEmpresa) {

        return RepositorioInformeEmpresa.save(newinformeEmpresa);
    }

    @Override
    public Optional<InformeEmpresaPojo> getrutEmpresa(String rut) {
        return Optional.empty();
    }

}
