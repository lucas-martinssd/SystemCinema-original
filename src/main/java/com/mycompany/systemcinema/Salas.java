/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

/**
 *
 * @author enzov
 */
public class Salas 
{
    //Atributos
    private int sala;
    private int assento;
    private Filme filme;

    public int getSala() 
    {
        return sala;
    }

    public void setSala(int sala) 
    {
        this.sala = sala;
    }

    public int getAssento() 
    {
        return assento;
    }

    public void setAssento(int assento) 
    {
        this.assento = assento;
    }

    public Filme getFilme() 
    {
        return filme;
    }

    public void setFilme(Filme filme) 
    {
        this.filme = filme;
    }
    //Construtores
    public Salas() {}
    
    public Salas (int sala, int assento)
    {
        this.sala = sala;
        this.assento = assento;
    }
    public Salas(int sala, int assento, Filme filme) 
    {
        this.sala = sala;
        this.assento = assento;
        this.filme = filme;
    }
}
