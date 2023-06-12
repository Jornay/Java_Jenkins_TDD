package com.projects.AF.servico;

import com.projects.AF.dominio.Curso;
import com.projects.AF.utils.CursosWrapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final CursoService cursoService;

    public AlunoService(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    public void matriculaCurso(Curso curso, List<Curso> cursos) {
        if(cursos.isEmpty() || !procuraCurso(curso, cursos)) {
            cursos.add(curso);
        }
    }

    public void cursosBonus(CursosWrapper cursosWrapper) {
        if(cursoService.calculaMedia(cursosWrapper.getCursos().get(0)) > 7.0) {
            for(Curso curso : cursosWrapper.getCursosBonus()) {
                matriculaCurso(curso, cursosWrapper.getCursos());
            }
        }
    }

    public boolean procuraCurso(Curso curso, List<Curso> cursos) {
        for(Curso cursoList : cursos) {
            if(cursoList.getNome().equals(curso.getNome())) {
                return true;
            }
        }
        return false;
    }
}
