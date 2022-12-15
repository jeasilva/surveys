package com.robinfood.surveys.util;

import com.robinfood.surveys.dto.PreguntaDTO;
import com.robinfood.surveys.dto.RespuestasPreguntasDTO;
import com.robinfood.surveys.entity.Pregunta;
import com.robinfood.surveys.entity.RespuestasPreguntas;

public class RespuestasPreguntasUtilTest {

    public static RespuestasPreguntas buildRespuestasPreguntas(){

        return RespuestasPreguntas.builder()
                .id(1)
                .respuesta("SI")
                .usuarioId(1)
                .pregunta(Pregunta.builder()
                        .id(1)
                        .build())
                .build();
    }

    public static RespuestasPreguntasDTO buildRespuestasPreguntasDTO(){

        return RespuestasPreguntasDTO.builder()
                .respuesta("Respuesta")
                .usuarioId(1)
                .pregunta(PreguntaDTO.builder()
                        .id(1)
                        .build())
                .build();
    }
}
