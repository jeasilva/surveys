package com.robinfood.surveys.repository;

import com.robinfood.surveys.entity.RespuestasPreguntas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestasPreguntasRepository extends JpaRepository<RespuestasPreguntas, Integer> {
}
