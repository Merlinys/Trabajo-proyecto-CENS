package com.example.ad.persistance.CrudrepositorioEntity;

import com.example.ad.domain.pojo.InformeEmpresaPojo;
import com.example.ad.persistance.entities.InformeEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.stream.DoubleStream;


public interface ICrudRepositorioInformeEmpresa extends JpaRepository<InformeEmpresa,Integer> {
    Optional<InformeEmpresa> findByRepRepEmpresa_RutEmpresa(String rutEmpresa);



}
