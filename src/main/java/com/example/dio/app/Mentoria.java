package com.example.dio.app;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
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
    public String toString()
    {
        return "Mentoria: " + super.getTitulo() + "\n" + //
                        "Descricao: " + super.getDescricao(); 
    }

}
