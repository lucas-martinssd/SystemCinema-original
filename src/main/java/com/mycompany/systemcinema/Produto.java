/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Produto {
    /**
     * nome do produto.
     */
    private String nome;
    /**
     * validade do produto.
     */
    private LocalDate validade;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public LocalDate getValidade() 
    {
        return validade;
    }

    public void setValidade(LocalDate validade) 
    {
        this.validade = validade;
    }
     
    /**
     * Constrói um novo produto sem informação.
     *
     */
    public Produto(){}

    /**
     * Constrói um novo usuário com nome e idade.
     *
     * @param nome O nome do produto.
     * @param validade a validade do produto.
     */
    public Produto(String nome, LocalDate validade) {
        this.nome = nome;
        this.validade = validade;
    }
}
