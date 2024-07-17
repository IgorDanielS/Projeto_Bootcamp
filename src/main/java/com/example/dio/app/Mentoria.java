package com.example.dio.app;

import lombok.Data;

import java.time.LocalDate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;
}
