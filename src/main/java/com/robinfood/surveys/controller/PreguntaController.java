package com.robinfood.surveys.controller;

import com.robinfood.surveys.dto.PreguntaDTO;
import com.robinfood.surveys.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController implements IPreguntaController {


    @Autowired
    private PreguntaService service;

    @Override
    public List<PreguntaDTO> getAllQuestions() {
        return service.listAll();
    }
}
