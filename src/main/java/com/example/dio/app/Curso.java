package com.example.dio.app;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
}
