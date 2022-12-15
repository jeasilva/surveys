package com.robinfood.surveys.util;


import com.robinfood.surveys.entity.OpcionesPregunta;
import com.robinfood.surveys.entity.Pregunta;

import java.util.Arrays;

public class PreguntaUtilTest {

    public static Pregunta buildPregunta(){

        return Pregunta.builder()
                .id(1)
                .descripcion("Descripcion")
                .tipo("Abierta")
                .opcionesPregunta(Arrays.asList(OpcionesPregunta.builder()
                        .id(2)
                        .build()))
                .build();
    }
}
