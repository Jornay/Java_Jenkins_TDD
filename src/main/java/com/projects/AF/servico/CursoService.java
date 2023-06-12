package com.projects.AF.servico;

import com.projects.AF.dominio.Curso;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    public double calculaMedia(Curso curso) {
        double media = 0.0;
        for(Double nota : curso.getNotas()) {
            media += nota;
        }
        return media/curso.getNotas().size();
    }
}
