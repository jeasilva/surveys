package com.robinfood.surveys.mapper;

import com.robinfood.surveys.dto.PreguntaDTO;
import com.robinfood.surveys.entity.Pregunta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IPreguntaMapper {

    IPreguntaMapper INSTANCE = Mappers.getMapper(IPreguntaMapper.class);

    List<PreguntaDTO> fromPreguntaToPreguntaDTO(List<Pregunta> pregunta);

    PreguntaDTO fromPreguntaToPreguntaDTO(Pregunta pregunta);

}
