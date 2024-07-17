package com.example.dio.app;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp)
    {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        
    }
    public void progredir()
    {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent())
        {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else
        {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }
    public double calcularTotalXp()
    {
        return this.conteudosConcluidos.stream()
        .mapToDouble(conteudo -> conteudo.calculaXp())
        .sum();
    }
}
