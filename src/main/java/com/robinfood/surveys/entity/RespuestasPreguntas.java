package com.robinfood.surveys.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RESPUESTAS_PREGUNTAS")
public class RespuestasPreguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "RESPUESTA")
    private String respuesta;

    @Column(name = "USUARIO_ID")
    private Integer usuarioId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "PREGUNTA_ID")
    private Pregunta pregunta;
}
