package com.robinfood.surveys.controller;

import com.robinfood.surveys.dto.RespuestasPreguntasDTO;
import com.robinfood.surveys.service.RespuestasPreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/respuestas")
public class RespuestasPreguntasController implements IRespuestasPreguntasController {

    @Autowired
    private RespuestasPreguntasService service;


    @Override
    public RespuestasPreguntasDTO saveQuestions(@RequestBody RespuestasPreguntasDTO respuestasPreguntasDTO) {
        return service.saveRespuestas(respuestasPreguntasDTO);
    }
}
