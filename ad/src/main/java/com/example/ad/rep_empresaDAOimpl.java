package com.example.ad;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import clases.rep_empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class rep_empresaDAOimpl implements rep_empresaDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<rep_empresa> get() {
        return null;
    }

    @Override
    public rep_empresa get(String rutEmpresa) {
        return null;
    }

    @Repository
    public static interface rep_empresaRepositorio extends CrudRepository<rep_empresa, String> {
        Optional<rep_empresa> findByRutEmpresa(String rutEmpresa);

        rep_empresa findByRutEmpresaAndContraseña(String rutEmpresa, String contraseña);
    }

    public static interface rep_empresaServicio {
        rep_empresa iniciarSesion(String rutEmpresa,String contraseña);

    }
}
