package com.projects.AF.controller;

import com.projects.AF.dominio.Curso;
import com.projects.AF.servico.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/{id}/media")
    public ResponseEntity<Double> calculaMedia(@PathVariable("id") Curso curso) {
        double media = cursoService.calculaMedia(curso);
        return new ResponseEntity<>(media, HttpStatus.OK);
    }
}
