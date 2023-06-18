package com.example.ad.domain.repositorioEntity;

import com.example.ad.persistance.entities.Evaluador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRepositorioEvaluadorEntity extends JpaRepository<Evaluador, Integer> {
    Optional<Evaluador> findByIdEvaluadorAndContraseña(int idEvaluador, String contraseña);

}
