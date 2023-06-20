package com.example.ad.persistance.CrudrepositorioEntity;

import com.example.ad.persistance.entities.RepEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRepositorioRepEmpresaEntity  extends JpaRepository<RepEmpresa,String> {
    @Query("select r from RepEmpresa r where r.rutEmpresa = ?1")
    Optional<RepEmpresa> findByRutEmpresa(String rutEmpresa);

    /* Existe 2 formas de representar lo de abajo usando optional y no , con optional
        es por si no existe , si se escribe sin el optional tiene que si o si existir
     */
    // busca un representante empresa por el id(String) y la contraseña (string)
    Optional<RepEmpresa> findByRutEmpresaAndContrasena(String id, String pass);



}
