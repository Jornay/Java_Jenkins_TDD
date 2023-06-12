package com.projects.AF.servico;

import com.projects.AF.dominio.Aluno;
import com.projects.AF.dominio.Curso;
import com.projects.AF.servico.AlunoService;
import com.projects.AF.servico.CursoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CursoServiceTest {

    private AlunoService alunoService;
    private CursoService cursoService;

    @BeforeEach
    public void setUp() {
        cursoService = new CursoService();
        alunoService = new AlunoService(cursoService);
    }

    @Test
    public void deveCalcularMediaDoCurso() {

        Aluno aluno = new Aluno("Alex");
        Curso curso1 = new Curso("Matematica");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(6.0);
        notas.add(5.0);

        alunoService.matriculaCurso(curso1, aluno.getCursos());
        aluno.getCursos().get(0).setNotas(notas);
        double media = cursoService.calculaMedia(aluno.getCursos().get(0));

        assertEquals(6.0, media, 0.00001);
    }
}
