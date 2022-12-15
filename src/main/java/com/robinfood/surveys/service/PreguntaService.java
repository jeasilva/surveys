package com.robinfood.surveys.service;

import com.robinfood.surveys.dto.PreguntaDTO;
import com.robinfood.surveys.entity.Pregunta;
import com.robinfood.surveys.mapper.IPreguntaMapper;
import com.robinfood.surveys.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository repository;

    public List<PreguntaDTO> listAll() {
        List<Pregunta> listPreguntas = repository.findAll();
        return IPreguntaMapper.INSTANCE.fromPreguntaToPreguntaDTO(listPreguntas);
    }

}
