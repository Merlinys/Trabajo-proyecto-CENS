package com.example.ad.persistance.mapper;

import com.example.ad.persistance.entities.RepEmpresa;
import com.example.ad.domain.pojo.RepEmpresaPojo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IRepEmpresaMapper {

    RepEmpresaPojo torepEmpresa(RepEmpresa repEmpresa);
    RepEmpresa torepEmpresaPojo(RepEmpresaPojo repEmpresaPojo);

    List<RepEmpresaPojo> toRepEmpresaPojo(List<RepEmpresa> repEmpresas);

}
