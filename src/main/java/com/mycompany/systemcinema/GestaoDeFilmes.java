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
 * Classe responsável pela gestão de filmes no sistema de cinema.
 * <p>
 * Esta classe permite operações como cadastrar um novo filme, remover um filme existente e listar todos os filmes.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class GestaoDeFilmes {
    
    /**
     * Lista para armazenar os filmes.
     */
    private List<Filme> filmes = new ArrayList<>();
    
    /**
     * Scanner para entrada de dados.
     */
    private Scanner sc = new Scanner(System.in);
    
    /**
     * Contador estático para controlar o número de filmes cadastrados.
     */
    public static int CONTADOR_FILME;
    
    /**
     * Construtor que inicializa a lista de filmes com uma lista existente.
     * @param filmes Lista pré-existente de filmes.
     */
    public GestaoDeFilmes(List<Filme> filmes) {
        this.filmes = new ArrayList<>(filmes);
    }

    /**
     * Construtor padrão que não inicializa a lista com filmes pré-existentes.
     */
    public GestaoDeFilmes() {}

    /**
     * Método para cadastrar um filme na lista de filmes. Solicita ao usuário o nome, gênero e duração do filme.
     */
    public void cadastraFilme() {
        System.out.println("Qual o nome do filme? ");
        String nome = sc.nextLine();
        System.out.println("Qual o gênero do filme? ");
        String genero = sc.nextLine();
        System.out.println("Qual a duração do filme? (formato HH:MM:SS)");
        String duracaoStr = sc.nextLine();
        Duration duracao = Duration.parse("PT" + duracaoStr.replace(":", "H") + "M");
        Filme novoFilme = new Filme(nome, genero, duracao);
        this.filmes.add(novoFilme);
        CONTADOR_FILME++;
    }

    /**
     * Método para remover um filme da lista através de um nome especificado pelo usuário.
     * Utiliza uma expressão lambda para comparar o nome do filme.
     * @return Retorna true se o filme foi removido com sucesso, false caso contrário.
     */
    public boolean removeFilme() {
        System.out.println("Qual o nome do filme que deseja remover? ");
        String nome = sc.nextLine();
        return filmes.removeIf(x -> x.getTitulo().equals(nome));
    }

    /**
     * Método para obter a lista de filmes.
     * @return Retorna a lista de filmes.
     */
    public List<Filme> getFilmes() {
        return filmes;
    }
    
}
