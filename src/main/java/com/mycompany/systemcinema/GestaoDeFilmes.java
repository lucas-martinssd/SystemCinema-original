/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;
import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.util.Scanner;
/**
 * Classe para fazer a gestao de filmes.
 * <p>
 * Esta classe é usada para gerir os filmes, tanto o filme em específico, como cadastrar um novo filme e remover um filme.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class GestaoDeFilmes 
{   
    Scanner sc = new Scanner(System.in);
    
    /**
     * Lista para criar diversos filmes.
     */
    private List<Filme> filmes = new ArrayList<>();
    /**
     * Contrutor que filmes recebe um ArrayList.
     * @param filmes direciona a todos os atributos da classe Filme
     */
    public GestaoDeFilmes(List<Filme> filmes) 
    {
        this.filmes = new ArrayList<>();
    }
    public GestaoDeFilmes(){}
    /**
     * Cadastra um filme na lista de filmes.
     * @param nome nome do filme.
     * @param genero genero do filme.
     * @param duracao duracao do filme.
     */
    public void cadastraFilme()
    {
        System.out.println("Qual o nome do filme? ");
        String nome = sc.nextLine();
        System.out.println("Qual o genero do filme? ");
        String genero = sc.nextLine();
        System.out.println("Qual a duração do filme? (formato HH:MM:SS)");
        String duracaoSrt = sc.nextLine();
        Duration duracao = Duration.parse("PT" + duracaoSrt);
        
        this.filmes.add(new Filme(nome,genero,duracao));
    }
     
    /**
     * Remove um filme da lista atravês de uma expressao lambda, em que caso X.getNome(chama o método getNome da clase Filme)e que em seguida compara o nome do filme X com o parâmetro nome. retorna True se forem iguais, removendo o filme da lista
     * @param nome nome do filme.
     * @return O filme removido.
     */
    public boolean removeFilme()
    {
        System.out.println("Qual o nome do filme que deseja remover? ");
        String nome = sc.nextLine();
        return filmes.removeIf(x -> x.getTitulo().equals(nome));
    }
    
    public List<Filme> getFilmes(){
    return filmes;
}
    
}