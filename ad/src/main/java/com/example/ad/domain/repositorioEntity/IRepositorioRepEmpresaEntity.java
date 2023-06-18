package com.example.ad.domain.repositorioEntity;

import com.example.ad.persistance.entities.RepEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IRepositorioRepEmpresaEntity  extends JpaRepository<RepEmpresa,String> {
    @Query("select r from RepEmpresa r where r.rutEmpresa = ?1")
    Optional<RepEmpresa> findByRutEmpresa(String rutEmpresa);

    Optional<RepEmpresa> findByRutEmpresaAndContrasena(String id, String pass);


}
