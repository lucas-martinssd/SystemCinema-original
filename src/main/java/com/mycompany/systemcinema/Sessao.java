/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe para representar informações da sessão.
 * <p>
 * Esta classe é usada para armazenar informações da sessão, contendo uma lista
 * de salas e a gestão de Filmes ,além do metodo de selecionar sala.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Sessao {

    /**
     * atributo que define que serão 5 salas.
     */
    private final Salas[] salas = new Salas[5];

    private List<Filme> filmes = new ArrayList<>();

    private List<LocalDate> horario;
    
    private Scanner scanner;

    public Salas[] getSala() {
        return salas;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<LocalDate> getHorario() {
        return horario;
    }

    public void setHorario(List<LocalDate> horario) {
        this.horario = horario;
    }
    
     public Sessao() {
        this.scanner = new Scanner(System.in);  // Inicializa o scanner uma vez
    }


    /**
     * Permite ao usuário selecionar um filme de uma lista de filmes
     * disponíveis. O método exibe todos os títulos de filmes disponíveis e
     * solicita ao usuário que escolha um filme pelo nome. Se o filme escolhido
     * estiver na lista, ele é retornado.
     *
     * @param gestao ges
     * @return O filme selecionado pelo usuário, ou {@code null} se o filme não
     * for encontrado.
     */
    public Filme selecionarFilme(GestaoDeFilmes gestao) {
        
            System.out.println("Filmes disponíveis:");
            for (Filme filme : gestao.getFilmes()) {
                System.out.println(filme.getTitulo());
            }
            System.out.println("Informe o filme que deseja assistir:");
            String filmeNome = scanner.nextLine();

            for (Filme filme : gestao.getFilmes()) {
                if (filme.getTitulo().equalsIgnoreCase(filmeNome)) {
                    System.out.println("Você selecionou: " + filme.getTitulo());
                    return filme; // Retorna o filme selecionado
                }
            }

            System.out.println("Filme não encontrado.");
        
        return null; // Retorna null se nenhum filme for encontrado
    }

    /**
     * Solicita ao usuário que especifique a quantidade de ingressos que deseja
     * comprar. O método lê a entrada do usuário e retorna o número de
     * ingressos.
     *
     * @return A quantidade de ingressos escolhida pelo usuário como um inteiro.
     */
    public int selecionarQuantIngressos() {
        
            System.out.println("Informe quantos ingressos deseja comprar:");
            
            int ingressos = Integer.parseInt(scanner.nextLine());
            System.out.println("Você selecionou " + ingressos + " ingressos.");
            return ingressos; // Retorna a quantidade de ingressos
        

    }

    /**
     * Permite ao usuário selecionar poltronas para uma sessão específica. O
     * método solicita ao usuário que selecione poltronas individuais para cada
     * ingresso comprado. Ele mostra os assentos disponíveis e permite ao
     * usuário escolher assentos por suas posições de fila e coluna.
     *
     * @param numeroIngressos O número de ingressos para os quais os assentos
     * precisam ser selecionados.
     * @param numeroSala O índice da sala de cinema na qual o filme está sendo
     * exibido.
     */
    public void selecionarPoltronas(int numeroIngressos, int numeroSala) {
        Salas sala = salas[numeroSala];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Assentos disponíveis:");
        sala.mostrarAssentos();

        for (int i = 0; i < numeroIngressos; i++) {
            System.out.println("Selecione a fila e a coluna para o ingresso " + (i + 1) + ":");
            int fila = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (sala.reservarAssento(fila, coluna)) {
                System.out.println("Assento (" + fila + ", " + coluna + ") reservado com sucesso.");
            } else {
                System.out.println("Assento já está ocupado, escolha outro.");
                i--; // Permite que o usuário tente novamente
            }
        }
        scanner.close();
    }
}