package com.robinfood.surveys.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PREGUNTAS")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "TIPO")
    private String tipo;

    @OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY)
    private List<RespuestasPreguntas> respuestasPreguntas;

    @OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY)
    private List<OpcionesPregunta> opcionesPregunta;
}
