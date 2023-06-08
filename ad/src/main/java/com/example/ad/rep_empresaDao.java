package com.example.ad;

import clases.rep_empresa;

import java.util.List;

public interface rep_empresaDao {
    List<rep_empresa> get();

    rep_empresa get(String rutEmpresa);



}
