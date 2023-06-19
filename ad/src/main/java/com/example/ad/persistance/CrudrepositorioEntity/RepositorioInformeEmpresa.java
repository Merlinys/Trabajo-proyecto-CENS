package com.example.ad.persistance.CrudrepositorioEntity;

import com.example.ad.domain.Repositorio.iRepositorioInformeEmpresa;
import com.example.ad.domain.pojo.InformeEmpresaPojo;
import com.example.ad.persistance.mapper.iInformeEmpresaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RepositorioInformeEmpresa implements iRepositorioInformeEmpresa {


    private final ICrudRepositorioInformeEmpresa iCrudRepositorioInformeEmpresa;
    private final iInformeEmpresaMapper informeEmpresaMapper;

    @Override
    public List<InformeEmpresaPojo> getAll() {
        return informeEmpresaMapper.toInformeEmpresaPojo(iCrudRepositorioInformeEmpresa.findAll());
    }

    @Override
    public Optional<InformeEmpresaPojo> getIdInforme(Integer id) {
        return iCrudRepositorioInformeEmpresa.findById(id)
                .map(informeEmpresaMapper::toInformeEmpresaPojo);
    }

    @Override
    public InformeEmpresaPojo save(InformeEmpresaPojo newinformeEmpresa) {
        return null;
    }
}
