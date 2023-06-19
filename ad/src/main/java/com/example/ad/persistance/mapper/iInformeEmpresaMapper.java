package com.example.ad.persistance.mapper;


import com.example.ad.domain.pojo.InformeEmpresaPojo;
import com.example.ad.persistance.entities.InformeEmpresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")


public interface iInformeEmpresaMapper {
    InformeEmpresaPojo toInformeEmpresaPojo(InformeEmpresa informeEmpresa);
    @Mapping(target = "evaluador", ignore = true)
    @Mapping(target = "repRepEmpresa", ignore = true)
    InformeEmpresa toInformeEmpresa(InformeEmpresaPojo informeEmpresaPojo);
    List<InformeEmpresaPojo> toInformeEmpresaPojo(List<InformeEmpresa> informeEmpresas);

}
