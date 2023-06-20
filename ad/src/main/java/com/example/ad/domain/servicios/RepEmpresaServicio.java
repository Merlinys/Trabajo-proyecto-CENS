package com.example.ad.domain.servicios;

import com.example.ad.persistance.CrudrepositorioEntity.IRepositorioRepEmpresaEntity;
import com.example.ad.persistance.entities.RepEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RepEmpresaServicio implements IRepEmpresaServicio {

    @Autowired
    private final IRepositorioRepEmpresaEntity repositorioRepEmpresa;

    @Override
    public List<RepEmpresa> listar() {
        return repositorioRepEmpresa.findAll();
    }
}
