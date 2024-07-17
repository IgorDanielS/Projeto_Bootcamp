package com.example.dio.app;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Conteudo {
    private String titulo;
    private String descricao;
    protected final double XP_BASE = 10d;


    public abstract double calculaXp();


    
    public String toString()
    {
        return "Titulo: " + this.titulo + "Descricao: " + this.descricao; 
    }
}
