package com.projects.AF.utils;

import com.projects.AF.dominio.Curso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursosWrapper {
    private List<Curso> cursosBonus;
    private List<Curso> cursos;
}

