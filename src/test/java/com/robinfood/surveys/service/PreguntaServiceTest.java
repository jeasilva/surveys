package com.robinfood.surveys.service;

import com.robinfood.surveys.dto.PreguntaDTO;
import com.robinfood.surveys.repository.PreguntaRepository;
import com.robinfood.surveys.util.PreguntaUtilTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PreguntaServiceTest {

    @Mock
    private PreguntaRepository repository;

    @InjectMocks
    private PreguntaService service;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testWhenGetPreguntasIsOk() {

        when(repository.findAll()).thenReturn(Arrays.asList(PreguntaUtilTest.buildPregunta()));
        List<PreguntaDTO> preguntaDTO = service.listAll();
        assertThat(preguntaDTO).isNotNull();
    }

    @Test
    void testWhenGetPreguntasIsEmpty() {

        when(repository.findAll()).thenReturn(new ArrayList<>());
        List<PreguntaDTO> preguntaDTO = service.listAll();
        assertThat(preguntaDTO).isNotNull();
        assertThat(preguntaDTO.size()).isEqualTo(0);
    }


}
