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
        this.scanner = new Scanner(System.in);  // Inicializa o scanner uma vez
    }

}