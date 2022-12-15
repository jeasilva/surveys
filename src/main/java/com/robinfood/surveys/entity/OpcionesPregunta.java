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
@Table(name = "OPCIONES_PREGUNTA")
public class OpcionesPregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "OPCION")
    private String opcion;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "PREGUNTA_ID")
    private Pregunta pregunta;


}
