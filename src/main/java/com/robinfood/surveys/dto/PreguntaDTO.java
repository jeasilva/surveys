package com.robinfood.surveys.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreguntaDTO {

    private Integer id;
    private String descripcion;
    private String tipo;
    private List<OpcionesPreguntaDTO> opcionesPregunta;
}
