package com.robinfood.surveys.controller;

import com.robinfood.surveys.dto.PreguntaDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IPreguntaController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<PreguntaDTO> getAllQuestions();
}
