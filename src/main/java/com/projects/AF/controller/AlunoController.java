package com.projects.AF.controller;

import com.projects.AF.dominio.Curso;
import com.projects.AF.servico.CursoService;
import com.projects.AF.servico.AlunoService;
import com.projects.AF.utils.CursosWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private CursoService cursoService;

    @PostMapping("/matricula")
    public ResponseEntity<Void> matriculaCurso(@RequestBody Curso curso, @RequestBody List<Curso> cursos) {
        alunoService.matriculaCurso(curso, cursos);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/cursos-bonus")
    public ResponseEntity<Void> cursosBonus(@RequestBody CursosWrapper cursosWrapper) {
        alunoService.cursosBonus(cursosWrapper);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
