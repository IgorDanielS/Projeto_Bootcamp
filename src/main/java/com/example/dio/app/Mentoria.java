package com.example.dio.app;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao)
    {
        super(titulo,descricao);
        this.data = data.now();
    }

    @Override
    public double calculaXp()
    {
        return XP_BASE + 10d;
    }
}
