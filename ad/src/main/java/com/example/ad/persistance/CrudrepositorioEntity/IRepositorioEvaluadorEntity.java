package com.example.ad.persistance.CrudrepositorioEntity;

import com.example.ad.persistance.entities.Evaluador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRepositorioEvaluadorEntity extends JpaRepository<Evaluador, Integer> {

    /* Existe 2 formas de representar lo de abajo usando optional y no , con optional
        es por si no existe , si se escribe sin el optional tiene que si o si existir
     */
    // busca un evaluador por el id(int) y la contraseña (string)
    Optional<Evaluador> findByIdEvaluadorAndContraseña(int idEvaluador, String contraseña);

}
