package com.example.ad.Repositorio;

import com.example.ad.Entity.rep_Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rep_EmpresaRepositorio extends JpaRepository<rep_Empresa,String> {

}
