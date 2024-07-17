package com.example.dio.app;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
    public String toString()
    {
        return "Curso: " + super.getTitulo() + "\nDescricao: " + super.getDescricao(); 
    }
}
