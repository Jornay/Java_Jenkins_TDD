package com.projects.AF.servico;

import com.projects.AF.dominio.Aluno;
import com.projects.AF.dominio.Curso;
import com.projects.AF.servico.AlunoService;
import com.projects.AF.servico.CursoService;
import com.projects.AF.utils.CursosWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AlunoServiceTest {

    private AlunoService alunoService;
    private CursoService cursoService;

    @BeforeEach
    public void setUp() {
        cursoService = new CursoService();
        alunoService = new AlunoService(cursoService);
    }

    @Test
    public void deveInscreverAlunoEmCursos() {

        Aluno aluno = new Aluno("Alex");
        Curso curso1 = new Curso("Matematica");
        Curso curso2 = new Curso("Fisica");
        Curso curso3 = new Curso("Geografia");

        alunoService.matriculaCurso(curso1, aluno.getCursos());
        alunoService.matriculaCurso(curso2, aluno.getCursos());
        alunoService.matriculaCurso(curso3, aluno.getCursos());

        Assertions.assertEquals(3, aluno.getCursos().size());
    }

    @Test
    public void naoDeveInscreverCursosJaMatriculados() {

        Aluno aluno = new Aluno("Alex");
        Curso curso1 = new Curso("Matematica");
        Curso curso2 = new Curso("Matematica");

        alunoService.matriculaCurso(curso1, aluno.getCursos());
        alunoService.matriculaCurso(curso2, aluno.getCursos());

        Assertions.assertEquals(1, aluno.getCursos().size());
    }

    @Test
    public void deveAdicionarTresCursosBonusSeMediaForAcimaDe7() {

        Aluno aluno = new Aluno("Alex");
        Curso curso1 = new Curso("Matematica");
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);

        Curso cursoBonus1 = new Curso("Fisica");
        Curso cursoBonus2 = new Curso("Geografia");
        Curso cursoBonus3 = new Curso("Biologia");
        List<Curso> cursosBonus = new ArrayList<Curso>();
        cursosBonus.add(cursoBonus1);
        cursosBonus.add(cursoBonus2);
        cursosBonus.add(cursoBonus3);

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);

        alunoService.matriculaCurso(curso1, aluno.getCursos());
        aluno.getCursos().get(0).setNotas(notas);
        CursosWrapper cursosWrapper = new CursosWrapper(cursosBonus, aluno.getCursos());
        alunoService.cursosBonus(cursosWrapper);

        Assertions.assertEquals(4, aluno.getCursos().size());
    }

    @Test
    public void naoDeveAdicionarTresCursosBonusSeMediaForAbaixoDe7() {

        Aluno aluno = new Aluno("Alex");
        Curso curso1 = new Curso("Matematica");
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);

        Curso cursoBonus1 = new Curso("Fisica");
        Curso cursoBonus2 = new Curso("Geografia");
        Curso cursoBonus3 = new Curso("Biologia");
        List<Curso> cursosBonus = new ArrayList<Curso>();
        cursosBonus.add(cursoBonus1);
        cursosBonus.add(cursoBonus2);
        cursosBonus.add(cursoBonus3);

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(6.0);
        notas.add(5.0);

        alunoService.matriculaCurso(curso1, aluno.getCursos());
        aluno.getCursos().get(0).setNotas(notas);
        CursosWrapper cursosWrapper = new CursosWrapper(cursosBonus, aluno.getCursos());
        alunoService.cursosBonus(cursosWrapper);

        Assertions.assertEquals(1, aluno.getCursos().size());
    }
}
