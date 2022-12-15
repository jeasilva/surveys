package com.robinfood.surveys.service;


import com.robinfood.surveys.dto.RespuestasPreguntasDTO;
import com.robinfood.surveys.entity.RespuestasPreguntas;
import com.robinfood.surveys.repository.RespuestasPreguntasRepository;
import com.robinfood.surveys.util.RespuestasPreguntasUtilTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RespuestasPreguntasServiceTest {

    @Mock
    private RespuestasPreguntasRepository repository;

    @InjectMocks
    private RespuestasPreguntasService service;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testWhenSaveRespuestasPreguntasIsOk(){

        RespuestasPreguntas entity = RespuestasPreguntasUtilTest.buildRespuestasPreguntas();
        when(repository.save(any(RespuestasPreguntas.class))).thenReturn(entity);
        RespuestasPreguntasDTO respuestasPreguntasDTO = service.saveRespuestas(RespuestasPreguntasUtilTest.buildRespuestasPreguntasDTO());
        assertThat(entity).isNotNull();
        assertThat(respuestasPreguntasDTO).isNotNull();
    }
}
