package com.example.ad.domain.servicios;

import com.example.ad.persistance.CrudrepositorioEntity.IRepositorioEvaluadorEntity;
import com.example.ad.persistance.entities.Evaluador;
import com.example.ad.persistance.entities.RepEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EvaluadorServicio implements iEvaluadorServicio {

    @Autowired
    private final IRepositorioEvaluadorEntity repositorioEvaluador;
    @Override
    public List<Evaluador> listar() {
        return repositorioEvaluador.findAll();
    }
}
