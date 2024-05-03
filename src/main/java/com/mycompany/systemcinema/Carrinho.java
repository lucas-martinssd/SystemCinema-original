/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe para representar abstr.
 * <p>
 * Esta classe é usada para gerir alguns metodos para realizar uma venda
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Carrinho {

    /**
     * Lista de produtos.
     */
    private List<Produto> produto;
    private Estoque estoque;
    private Scanner scanner;
    /**
     * Lista de sessoes.
     */
    private List<Sessao> sessao;

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

    public Carrinho() {
        this.scanner = new Scanner(System.in);  // Inicializa o scanner uma vez
    }
    public Carrinho(Estoque estoque) {
        this.estoque = estoque;
        this.produto = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Constrói um novo usuário com nome e idade.
     *
     * @param produto O produto.
     * @param sessao a sessao selecionada.
     */
    public Carrinho(List<Produto> produto, List<Sessao> sessao) {
        this.produto = produto;
        this.sessao = sessao;
    }

    public Produto selecionarProduto() {
        System.out.println("Produtos disponíveis: ");
        estoque.listarProdutos();
        System.out.println("\nInforme o produto que deseja assistir:");
        String selecionaProduto = scanner.nextLine();

        for (Produto produto : estoque.getProduto()) {
            if (produto.getNome().equalsIgnoreCase(selecionaProduto)) {
                System.out.println("Você selecionou: " + produto.getNome() + " ingresso(s)");
                return produto;
            }
        }
        System.out.println("Filme não encontrado.");

        return null; // Retorna null se o produto nao for encontrado
    }

    public int selecionarQuantProduto() {

        System.out.println("Informe a quantidade desejada desse produto");

        int selecao = scanner.nextInt();
        System.out.println("Você selecionou " + selecao + " produto(s)");
        return selecao;

    }
    
    public int selecionarQuantidadeIngresssos(){
        System.out.println("Informe quantos ingressos você deseja: ");
        int quantidadeIngressos = scanner.nextInt();
        return quantidadeIngressos;
    }
}
