package com.projects.AF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
@ComponentScan(basePackages = "com.projects.AF")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "admin";
        String password = "12345";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conectado ao PostgreSQL com sucesso!");
        } catch (SQLException e) {
            System.out.println("Falha ao conectar ao PostgreSQL:");
            e.printStackTrace();
        }
    }
}
