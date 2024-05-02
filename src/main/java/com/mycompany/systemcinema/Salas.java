/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

/**
 * Classe para representar detalhes da sala.
 * <p>
 * Esta classe é usada para armazenar informações de sala.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Salas {

    /**
     * numero da sala.
     */
    private int sala;
    /**
     * quantidade de assentos de uma sala, quantidade constante, sendo 64
     */
    private final int NUMERO_ASSENTOS = 64;

    private boolean[][] assentos = new boolean[8][8];
    /**
     * Atributos filme, do tipo que filme que recebe todas as informações da
     * classe filme
     */
    private Filme filme;

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    /**
     * Constrói um novo produto sem informação.
     *
     */
    public Salas() {
    }

    /**
     * Constrói uma nova sala apenas com o atributo sala.
     *
     */
    public Salas(int sala) {
        this.sala = sala;
    }

    /**
     * Constrói uma nova sala com as informações sala e o filme.
     *
     */
    public Salas(int sala, Filme filme) {
        this.sala = sala;
        this.filme = filme;
        inicializarAssentos();
    }

    /**
     * Constrói uma nova sala com as informações sala e o filme.
     *
     */
    private void inicializarAssentos() {
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                assentos[i][j] = false; // Falso significa que o assento está disponível
            }
        }
    }

    /**
     * Tenta reservar um assento específico na sala.
     *
     * @param fila A fila do assento a ser reservado.
     * @param coluna A coluna do assento a ser reservado.
     * @return {@code true} se o assento foi reservado com sucesso,
     * {@code false} se o assento já estava ocupado.
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
     * Mostra o estado atual dos assentos na sala. Este método imprime uma
     * matriz dos assentos, onde 'X' representa um assento ocupado e 'O'
     * representa um assento disponível.
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