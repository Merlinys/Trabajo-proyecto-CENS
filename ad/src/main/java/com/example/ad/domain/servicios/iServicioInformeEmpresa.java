package com.example.ad.domain.servicios;

import com.example.ad.domain.pojo.InformeEmpresaPojo;

import java.util.List;
import java.util.Optional;

public interface iServicioInformeEmpresa {
    List<InformeEmpresaPojo> getAll();

    Optional<InformeEmpresaPojo> getidInforme(Integer id);

    InformeEmpresaPojo save(InformeEmpresaPojo newinformeEmpresa);

    Optional<InformeEmpresaPojo> getrutEmpresa(String rut);
}
