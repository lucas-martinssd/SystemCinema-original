/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe para representar um carrinho de compras.
 * <p>
 * Esta classe é usada para gerenciar alguns métodos para realizar uma venda.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Carrinho {

    /**
     * Lista de produtos no carrinho.
     */
    private List<Produto> produto;

    /**
     * Lista de sessões.
     */
    private List<Sessao> sessao;

    /**
     * Scanner para entrada de dados.
     */
    private Scanner scanner;

    /**
     * Seleção do produto.
     */
    private String selecionaProduto;
    
    private Salas[] salas;

    /**
     * Construtor padrão da classe Carrinho.
     */
    public Carrinho() {
        this.produto = new ArrayList<>();
        this.sessao = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Construtor da classe Carrinho.
     *
     * @param estoque          o estoque disponível
     * @param selecionaProduto o produto selecionado
     */
    public Carrinho(Estoque estoque, String selecionaProduto) {
        this.produto = new ArrayList<>();
        this.sessao = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.selecionaProduto = selecionaProduto;
    }

    /**
     * Construtor da classe Carrinho.
     *
     * @param produto a lista de produtos
     * @param sessao  a lista de sessões
     */
    public Carrinho(List<Produto> produto, List<Sessao> sessao) {
        this.produto = produto;
        this.sessao = sessao;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método para selecionar um produto disponível no estoque.
     *
     * @param estoque o estoque disponível
     * @return o produto selecionado
     */
    public Produto selecionarProduto(Estoque estoque) {
        System.out.println("Produtos disponíveis: ");
        estoque.listarProdutos();
        System.out.println("\nInforme o produto que deseja:");
        selecionaProduto = scanner.nextLine();

        for (Produto produto : estoque.getProduto()) {
            if (produto.getNome().equalsIgnoreCase(selecionaProduto)) {
                System.out.println("Você selecionou: " + produto.getNome());
                selecionarQuantProduto();
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    /**
     * Método para selecionar a quantidade desejada de um produto.
     *
     * @return a quantidade selecionada
     */
    public int selecionarQuantProduto() {
        System.out.println("Informe a quantidade desejada desse produto");
        int selecao = Integer.parseInt(scanner.nextLine());
        System.out.println("Você selecionou " + selecao + " produto(s)");
        return selecao;
    }

    /**
     * Método para selecionar a quantidade de ingressos desejada pelo cliente.
     *
     * @return a quantidade de ingressos escolhida pelo cliente
     */
    public int selecionarQuantIngressos() {
        System.out.println("Informe quantos ingressos deseja comprar:");
        int ingressos = Integer.parseInt(scanner.nextLine());
        System.out.println("Você selecionou " + ingressos + " ingressos.");
        return ingressos;
    }

    /**
     * Método para selecionar um filme disponível na gestão de filmes.
     *
     * @param gestao a gestão de filmes disponíveis
     * @return o filme selecionado pelo cliente
     */
    public Filme selecionarFilme(GestaoDeFilmes gestao) {
        System.out.println("Filmes disponíveis:");
        for (Filme filme : gestao.getFilmes()) {
            System.out.println(filme.getTitulo());
        }
        System.out.println("Informe o filme que deseja assistir:");
        String filmeNome = scanner.nextLine();

        for (Filme filme : gestao.getFilmes()) {
            if (filme.getTitulo().equalsIgnoreCase(filmeNome)) {
                System.out.println("Você selecionou: " + filme.getTitulo());
                return filme;
            }
        }
        System.out.println("Filme não encontrado.");
        return null;
    }

    /**
     * Método para selecionar poltronas para uma sessão específica.
     *
     * @param numeroDeIngressos o número de ingressos para os quais as poltronas serão selecionadas
     * @param numeroSala        o índice da sala de cinema na qual o filme está sendo exibido
     */
    public void selecionarPoltronas(int numeroDeIngressos, int numeroSala) {
        if (numeroSala >= 0 && numeroSala < salas.length && salas[numeroSala] != null) {
            Salas sala = salas[numeroSala];
            System.out.println("Assentos disponíveis:");
            sala.mostrarAssentos();

            for (int i = 0; i < numeroDeIngressos; i++) {
                System.out.println("Escolha a fila para o ingresso " + (i + 1) + ":");
                int fila = scanner.nextInt();
                System.out.println("Escolha a coluna para o ingresso " + (i + 1) + ":");
                int coluna = scanner.nextInt();

                if (sala.reservarAssento(fila, coluna)) {
                    System.out.println("Assento (" + fila + ", " + coluna + ") reservado com sucesso.");
                } else {
                    System.out.println("Assento já está ocupado, escolha outro.");
                    i--;
                }
            }
        } else {
            System.out.println("Número da sala inválido ou sala não inicializada.");
        }
    }

    /**
     * Método toString que retorna a representação em String dos produtos no carrinho.
     *
     * @return a representação em String dos produtos no carrinho
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produtos no carrinho:\n");
        for (Produto produto : this.produto) {
            sb.append(produto.getNome()).append("\n");
        }
        return sb.toString();
    }
}
