package com.projects.AF.dominio;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Data
public class Curso {

    private String nome;
    private List<Double> notas;

    @JsonCreator
    public Curso(@JsonProperty("nome") String nome, @JsonProperty("notas") List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public Curso(String nome) {
        this.nome = nome;
    }

    @JsonCreator
    public Curso() {
    }

}
