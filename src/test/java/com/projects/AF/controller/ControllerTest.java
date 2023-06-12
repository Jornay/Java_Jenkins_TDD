package com.projects.AF.controller;

import com.projects.AF.dominio.Curso;
import com.projects.AF.servico.AlunoService;
import com.projects.AF.servico.CursoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@WebMvcTest(controllers = {AlunoController.class, CursoController.class})
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AlunoService alunoService;

    @MockBean
    private CursoService cursoService;

    @Test
    public void testCursosBonus() throws Exception {
        Curso curso = new Curso("Matemática");
        List<Curso> cursos = new ArrayList<>();
        cursos.add(curso);

        String requestBody = "{"
                + "\"cursosBonus\":[{\"nome\":\"Física\"}],"
                + "\"cursos\":[{\"nome\":\"Matemática\"}]"
                + "}";

        mockMvc.perform(MockMvcRequestBuilders.post("/alunos/cursos-bonus")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isCreated());

    }

    @Test
    public void testCalculaMedia() throws Exception {
        Curso curso = new Curso("Matemática");
        curso.setNotas(List.of(7.0, 8.0, 9.0));

        when(cursoService.calculaMedia(any(Curso.class))).thenReturn(8.0);

        mockMvc.perform(MockMvcRequestBuilders.get("/cursos/1/media"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("8.0"));
    }
}
