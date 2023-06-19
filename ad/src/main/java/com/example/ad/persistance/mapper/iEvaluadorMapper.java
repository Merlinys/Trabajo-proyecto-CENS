package com.example.ad.persistance.mapper;

import com.example.ad.persistance.entities.Evaluador;
import com.example.ad.domain.pojo.EvaluadorPojo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface iEvaluadorMapper {

    EvaluadorPojo toEvaluador(Evaluador evaluador);

    @Mapping(target = "repRepEmpresa", ignore = true)
    Evaluador toEvaluadorPojo(EvaluadorPojo evaluadorPojo);

    List<EvaluadorPojo> toEvaluadorPojo(List<Evaluador> evaluadors);
}
