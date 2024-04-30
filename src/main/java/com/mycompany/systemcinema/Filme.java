/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;


/**
 *
 * @author enzov
 */
public class Filme 
{
    private String nome;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String filme) {
        this.nome = filme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Filme(String filme, String genero) {
        this.nome = filme;
        this.genero = genero;
    }
}
