/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.Duration;

/**
 * Classe para representar atributos de um Filme.
 * <p>
 * Esta classe é usada para armazenar características de um Filme como nome, gênero e duração.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Filme 
{   
    /**
     * O nome do filme.
     */
    private String titulo;
    
    /**
     * O gênero do Filme.
     */
    private String genero;
    
    /**
     * A duração do Filme.
     */
    private Duration duracao;

    /**
     * Obtém o título do filme.
     * 
     * @return O título do filme.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do filme.
     * 
     * @param titulo O título do filme.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém o gênero do filme.
     * 
     * @return O gênero do filme.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o gênero do filme.
     * 
     * @param genero O gênero do filme.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtém a duração do filme.
     * 
     * @return A duração do filme.
     */
    public Duration getDuracao() {
        return duracao;
    }

    /**
     * Define a duração do filme.
     * 
     * @param duracao A duração do filme.
     */
    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }
    
    /**
     * Construtor padrão da classe Filme.
     */
    public Filme(){}

    /**
     * Constrói um novo filme com título, gênero e duração.
     *
     * @param titulo O título do filme.
     * @param genero O gênero do filme.
     * @param duracao A duração do filme.
     */
    public Filme(String titulo, String genero, Duration duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }
    
    /**
     * Sobrescreve o método toString para retornar o título, gênero e duração do filme.
     *
     * @return Uma string que representa o filme no formato "Título, Gênero, Duração".
     */
    @Override
    public String toString() {
        return titulo + ", " + genero + ", " + duracao;
    }
}