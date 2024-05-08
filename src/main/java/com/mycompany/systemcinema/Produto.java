/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.time.LocalDate;

/**
 * Classe que representa um Produto dentro do sistema.
 * <p>
 * Esta classe é utilizada para gerenciar informações relacionadas a produtos, incluindo nome e data de validade.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Produto {
    
    /**
     * Nome do produto.
     */
    private String nome;
    
    /**
     * Data de validade do produto.
     */
    private LocalDate validade;

    /**
     * Retorna o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O novo nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a data de validade do produto.
     *
     * @return A data de validade do produto.
     */
    public LocalDate getValidade() {
        return validade;
    }

    /**
     * Define a data de validade do produto.
     *
     * @param validade A nova data de validade do produto.
     */
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    
    /**
     * Construtor padrão que cria um produto sem inicializar nome ou validade.
     */
    public Produto() {}

    /**
     * Constrói um novo produto com nome e validade especificados.
     *
     * @param nome O nome do produto.
     * @param validade A data de validade do produto.
     */
    public Produto(String nome, LocalDate validade) {
        this.nome = nome;
        this.validade = validade;
    }
    
}
