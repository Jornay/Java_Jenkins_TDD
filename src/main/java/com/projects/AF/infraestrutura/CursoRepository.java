package com.projects.AF.infraestrutura;

import com.projects.AF.dominio.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, String> {
}
