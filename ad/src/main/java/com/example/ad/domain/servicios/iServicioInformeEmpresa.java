package com.example.ad.domain.servicios;

import com.example.ad.domain.pojo.InformeEmpresaPojo;

import java.util.List;
import java.util.Optional;

public interface iServicioInformeEmpresa {
    List<InformeEmpresaPojo> getAll();

    Optional<InformeEmpresaPojo> getIdInforme(Integer id);

    InformeEmpresaPojo save(InformeEmpresaPojo newinformeEmpresa);

}
