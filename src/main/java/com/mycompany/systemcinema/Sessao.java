/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que representa uma sessão no sistema de cinema.
 * <p>
 * Esta classe é responsável por armazenar e gerenciar informações relativas às sessões de cinema, incluindo salas, filmes e horários das sessões.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Sessao {

    /**
     * Array que armazena as salas disponíveis para as sessões, com um total de 5 salas.
     */
    private final Salas[] salas = new Salas[5];

    /**
     * Lista de filmes disponíveis nas sessões.
     */
    private List<Filme> filmes = new ArrayList<>();

    /**
     * Lista de horários das sessões.
     */
    private List<LocalDate> horario;

    /**
     * Scanner utilizado para entrada de dados pelo usuário.
     */
    private Scanner scanner;

    /**
     * Construtor que inicializa a classe Sessao com um novo scanner para entrada de dados.
     */
    public Sessao() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Retorna as salas disponíveis para as sessões.
     *
     * @return Um array de objetos Salas.
     */
    public Salas[] getSala() {
        return salas;
    }

    /**
     * Retorna a lista de filmes disponíveis para as sessões.
     *
     * @return Uma lista de objetos Filme.
     */
    public List<Filme> getFilmes() {
        return filmes;
    }

    /**
     * Define a lista de filmes disponíveis para as sessões.
     *
     * @param filmes A nova lista de filmes.
     */
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    /**
     * Retorna a lista de horários das sessões.
     *
     * @return Uma lista de datas representando os horários das sessões.
     */
    public List<LocalDate> getHorario() {
        return horario;
    }

    /**
     * Define a lista de horários das sessões.
     *
     * @param horario A nova lista de horários.
     */
    public void setHorario(List<LocalDate> horario) {
        this.horario = horario;
    }

}
