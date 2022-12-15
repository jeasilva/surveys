package com.robinfood.surveys.controller;

import com.robinfood.surveys.dto.RespuestasPreguntasDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

public interface IRespuestasPreguntasController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    RespuestasPreguntasDTO saveQuestions(RespuestasPreguntasDTO respuestasPreguntasDTO);
}
