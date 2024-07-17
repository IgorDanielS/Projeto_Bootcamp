package com.example.dio.app;

import lombok.Data;

@Data
public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria)
    {
        super(titulo,descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calculaXp(){
        return XP_BASE * cargaHoraria;
    }
}
