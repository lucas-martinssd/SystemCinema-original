/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author enzov
 */
public class GestaoDeFilmes 
{
    private List<Filme> filmes;

    public GestaoDeFilmes(List<Filme> filmes) 
    {
        this.filmes = new ArrayList<>();
    }
    // Adiciona um filme na lista de filmes
    public void cadastraFilme(String nome, String genero)
    {
        filmes.add(new Filme(nome,genero));
    }
    // Remove um filme da lista atravês de uma expressao lambda, em que caso X.getNome(chama o método getNome da clase Filme)e que em seguida compara o nome do filme X com o parâmetro nome. retorna True se forem iguais, removendo o filme da lista 
    public boolean removeFilme(String nome)
    {
        return filmes.removeIf(x -> x.getNome().equals(nome));
    }
    
}