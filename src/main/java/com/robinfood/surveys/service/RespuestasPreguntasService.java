package com.robinfood.surveys.service;

import com.robinfood.surveys.dto.RespuestasPreguntasDTO;
import com.robinfood.surveys.mapper.IRespuestasPreguntasMapper;
import com.robinfood.surveys.repository.RespuestasPreguntasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RespuestasPreguntasService {

    @Autowired
    private RespuestasPreguntasRepository repository;

    public RespuestasPreguntasDTO saveRespuestas(RespuestasPreguntasDTO respuestasPreguntasDTO) {

        var entity = IRespuestasPreguntasMapper.INSTANCE.fromRespuestasPreguntasDTOToRespuestasPreguntas(respuestasPreguntasDTO);
        return IRespuestasPreguntasMapper.INSTANCE.fromRespuestasPreguntasToRespuestasPreguntasDTO(repository.save(entity));
    }
}
