package com.robinfood.surveys.mapper;

import com.robinfood.surveys.dto.RespuestasPreguntasDTO;
import com.robinfood.surveys.entity.RespuestasPreguntas;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IRespuestasPreguntasMapper {

    IRespuestasPreguntasMapper INSTANCE = Mappers.getMapper(IRespuestasPreguntasMapper.class);

    RespuestasPreguntasDTO fromRespuestasPreguntasToRespuestasPreguntasDTO(RespuestasPreguntas respuestasPreguntas);

    RespuestasPreguntas fromRespuestasPreguntasDTOToRespuestasPreguntas(RespuestasPreguntasDTO respuestasPreguntasDTO);
}
