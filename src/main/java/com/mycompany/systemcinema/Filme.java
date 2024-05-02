/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;
import java.time.Duration;


/**
 * Classe para representar atributos de um Filme.
 * <p>
 * Esta classe é usada para armazenar características de um Filme como nome, genero e duração.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Filme 
{   
    /**
     * nome do filme.
     */
    private String titulo;
    
    /**
     * genero do Filme.
     */
    private String genero;
    /**
     * duração do Filme.
     */
    private Duration duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }
    public Filme(){}
    /**
     * Constrói um novo usuário com nome e idade.
     *
     * @param titulo O nome do filme.
     * @param idade o genero do filme.
     * @param duracao a duração do filme
     */
    public Filme(String titulo, String genero, Duration duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }
    
    /**
     * sobrescreve o ToString para que mostre o nome, genero e duracao na tal formatação.
     *
     */
    @Override
    public String toString() {
        return titulo + ", " + genero + ", " + duracao;
    }
}