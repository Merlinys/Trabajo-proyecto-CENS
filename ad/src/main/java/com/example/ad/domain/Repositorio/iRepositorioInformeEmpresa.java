package com.example.ad.domain.Repositorio;

import com.example.ad.domain.pojo.InformeEmpresaPojo;

import java.util.List;
import java.util.Optional;

public interface iRepositorioInformeEmpresa {
    List<InformeEmpresaPojo> getAll();

    Optional<InformeEmpresaPojo> getidInforme(Integer id);

    InformeEmpresaPojo save(InformeEmpresaPojo newinformeEmpresa);




}
