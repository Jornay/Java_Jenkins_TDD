package com.projects.AF.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Aluno {
    @NotNull
    private String nome;
    private List<Curso> cursos = new ArrayList<Curso>();

}