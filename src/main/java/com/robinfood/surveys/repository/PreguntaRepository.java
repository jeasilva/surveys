package com.robinfood.surveys.repository;

import com.robinfood.surveys.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {

}
