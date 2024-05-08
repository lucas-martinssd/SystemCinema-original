/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

/**
 * Classe que representa uma sala de cinema.
 * <p>
 * Armazena informações sobre uma sala de cinema, incluindo seu número, a configuração dos assentos e o filme sendo exibido.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Salas {

    /**
     * Número identificador da sala.
     */
    private int sala;

    /**
     * Quantidade constante de assentos na sala, definida como 64.
     */
    private final int NUMERO_ASSENTOS = 64;

    /**
     * Matriz de assentos na sala, onde cada assento é representado por um booleano (true se ocupado, false se disponível).
     */
    private boolean[][] assentos = new boolean[8][8];

    /**
     * Filme atualmente exibido nesta sala.
     */
    private Filme filme;

    /**
     * Retorna o número da sala.
     *
     * @return O número identificador da sala.
     */
    public int getSala() {
        return sala;
    }

    /**
     * Define o número da sala.
     *
     * @param sala O novo número da sala.
     */
    public void setSala(int sala) {
        this.sala = sala;
    }

    /**
     * Retorna o filme sendo exibido na sala.
     *
     * @return O filme atual.
     */
    public Filme getFilme() {
        return filme;
    }

    /**
     * Define o filme a ser exibido nesta sala.
     *
     * @param filme O filme a ser exibido.
     */
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    /**
     * Construtor padrão que cria uma sala sem informações iniciais.
     */
    public Salas() {}

    /**
     * Constrói uma nova sala com um número identificador.
     *
     * @param sala O número da sala.
     */
    public Salas(int sala) {
        this.sala = sala;
    }

    /**
     * Constrói uma nova sala com um número e um filme especificados.
     *
     * @param sala O número da sala.
     * @param filme O filme a ser exibido na sala.
     */
    public Salas(int sala, Filme filme) {
        this.sala = sala;
        this.filme = filme;
    }

    /**
     * Inicializa todos os assentos da sala como disponíveis.
     */
    public void inicializarAssentos() {
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                assentos[i][j] = false; // Assento disponível
            }
        }
    }

    /**
     * Tenta reservar um assento na sala.
     *
     * @param fila A fila do assento a ser reservado.
     * @param coluna A coluna do assento a ser reservado.
     * @return {@code true} se o assento foi reservado com sucesso, {@code false} se o assento já estava ocupado.
     */
    public boolean reservarAssento(int fila, int coluna) {
        if (!assentos[fila][coluna]) {
            assentos[fila][coluna] = true; // Reserva o assento
            return true;
        } else {
            return false; // Assento já está ocupado
        }
    }

    /**
     * Exibe o estado atual dos assentos na sala.
     * <p>
     * Este método imprime uma matriz dos assentos, onde 'X' representa um assento ocupado e 'O' representa um assento disponível.
     * </p>
     */
    public void mostrarAssentos() {
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                System.out.print(assentos[i][j] ? "X " : "O ");
            }
            System.out.println(); // Nova linha após cada fila
        }
    }

}
