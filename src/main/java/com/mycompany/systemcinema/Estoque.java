/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Classe para armazenar e detalhar o Estoque.
 * <p>
 * Esta classe é usada para armazenar características de um Produto, cadastrar e remover um produto, além de listar os produtos.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Estoque 
{
    /**
     * Lista para armazenar os produtos.
     */
    private List<Produto> produto;
    
    public List<Produto> getProduto(){
        return produto;
    }
    
    /**
     * Quantidade de pipoca no estoque.
     */
    private int quantidadePipoca;
    
    /**
     * Quantidade de bebidas no estoque.
     */
    private int quantidadeBebidas;
    
    /**
     * Quantidade de guloseimas no estoque.
     */
    private int quantidadeGuloseimas;
    
    Scanner sc = new Scanner(System.in);
    
    /**
     * Construtor padrão que inicializa a lista de produtos.
     */
    public Estoque ()
    {
        this.produto = new ArrayList<>();
    }

    /**
     * Construtor que inicializa o estoque com quantidades específicas de pipoca, bebidas e guloseimas.
     * 
     * @param quantidadePipoca A quantidade inicial de pipoca no estoque.
     * @param quantidadeBebidas A quantidade inicial de bebidas no estoque.
     * @param quantidadeGuloseimas A quantidade inicial de guloseimas no estoque.
     */
    public Estoque(int quantidadePipoca, int quantidadeBebidas, int quantidadeGuloseimas) {
        this.quantidadePipoca = quantidadePipoca;
        this.quantidadeBebidas = quantidadeBebidas;
        this.quantidadeGuloseimas = quantidadeGuloseimas;
    }
    
    /**
     * Método para cadastrar um novo produto no estoque.
     * 
     * @param nome O nome do produto.
     * @param validadeStr A data de validade do produto no formato "dd/MM/yyyy".
     */
    public void cadastrarProduto(String nome, String validadeStr)
    {   
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate validade = LocalDate.parse(validadeStr, formatoData);
        this.produto.add(new Produto(nome, validade));
    }
    
    /**
     * Método para remover um produto do estoque.
     * 
     * @return True se o produto foi removido com sucesso, False caso contrário.
     */
    public boolean removerProduto()
    {   
        System.out.println("Qual o nome do produto que deseja remover? ");
        String nome = sc.nextLine();
        return produto.removeIf(x -> x.getNome().equals(nome));
    }
    
    /**
     * Método para listar todos os produtos do estoque.
     */
    public void listarProdutos()
    {
        for(Produto list : produto)
        {
            System.out.println("\nProduto: " + list.getNome());
        }
    }

    // Getters e Setters
    
    public int getQuantidadePipoca() {
        return quantidadePipoca;
    }

    public int getQuantidadeBebidas() {
        return quantidadeBebidas;
    }

    public int getQuantidadeGuloseimas() {
        return quantidadeGuloseimas;
    }

    public void setQuantidadePipoca(int quantidadePipoca) {
        this.quantidadePipoca = quantidadePipoca;
    }

    public void setQuantidadeBebidas(int quantidadeBebidas) {
        this.quantidadeBebidas = quantidadeBebidas;
    }

    public void setQuantidadeGuloseimas(int quantidadeGuloseimas) {
        this.quantidadeGuloseimas = quantidadeGuloseimas;
    }
}