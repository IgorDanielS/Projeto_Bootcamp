package com.example.dio.app;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public abstract class Conteudo {
    private String titulo;
    private String descricao;
    protected final double XP_BASE = 10d;


    public abstract double calculaXp();

}
