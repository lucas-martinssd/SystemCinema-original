/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author enzov
 */
public class GestaoDeSalas 
{
    //Atributos
    private List<Salas> sala;
    
    //Métodos
    // Adiciona uma sala na lista de salas
    protected void insereSala(int sala, int assentos)
    {
        this.sala.add(new Salas(sala, assentos));
    }
    // Remove uma sala da lista atravês de uma expressao lambda, em que caso X.getSala(chama o método getSala da clase Sala)e que em seguida compara o numero da sala X com o parâmetro sala. retorna True se forem iguais, removendo uma sala da lista Salas 
    protected boolean removeSala(int sala)
    {
        return this.sala.removeIf(x -> x.getSala()== sala);
    }
    protected void selecionarSala(int sala)
    {
        
    } 
     protected void selecionarAssento(int sala)
    {
        int [][] matrizAssentos = new int [8][8];
        for(int l=0; l < 8; l++)
        {
            for(int c =0; c < 8; c++)
            {
                
            }
        }
    } 
    
}

