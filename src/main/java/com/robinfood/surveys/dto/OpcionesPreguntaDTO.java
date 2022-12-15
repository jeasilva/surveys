package com.robinfood.surveys.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpcionesPreguntaDTO {

    private String opcion;
    private String descripcion;
}
