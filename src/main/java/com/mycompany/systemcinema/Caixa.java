/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.util.Scanner;

/**
 * Representa o caixa do cinema, responsável por calcular e gerenciar pagamentos.
 * Permite calcular o valor dos produtos e ingressos selecionados, realizar ou
 * cancelar pagamentos, e gerar um extrato dos produtos selecionados.
 * 
 * @author Lucas
 * @version 1.0
 */
public class Caixa {
    
    private double id;
    private static double valorIngresso = 10;
    private static double pipoca = 5;
    private static double bebidas = 5;
    private static double guloseimas = 5;
    private Carrinho carrinho;
    private Estoque estoque;
    
    Scanner sc = new Scanner(System.in);
    
    /**
     * Calcula e exibe o valor dos produtos escolhidos pelo cliente.
     * 
     * @param carrinho O carrinho de compras do cliente.
     * @return O valor total dos produtos escolhidos.
     */
    public double informaValorProdutos(Carrinho carrinho){
       double valorProdutos = carrinho.selecionarQuantProduto() * 5;
       System.out.println("O valor dos produtos escolhidos é: R$ " + valorProdutos);
       return valorProdutos;
    }
    
    /**
     * Calcula e exibe o valor dos ingressos selecionados pelo cliente.
     * 
     * @param carrinho O carrinho de compras do cliente.
     * @return O valor total dos ingressos selecionados.
     */
    public double informaValorIngressos(Carrinho carrinho){
        double valorIngressos = carrinho.selecionarQuantIngressos() * 10;
        System.out.println("O valor dos ingressos desejados é: R$ " + valorIngressos);
        return valorIngressos;
    }
    
    /**
     * Cancela o pagamento e exibe uma mensagem de confirmação.
     * 
     * @return Uma mensagem confirmando o cancelamento do pagamento.
     */
    public String cancelaPagamento(){
        String cancelamento = "Pagamento cancelado";
        System.out.println(cancelamento);
        return cancelamento;
    }
    
    /**
     * Realiza o pagamento com base nos produtos e ingressos selecionados pelo cliente.
     * 
     * @param carrinho O carrinho de compras do cliente.
     * @return O valor total da compra.
     */
    public double realizaPagamento(Carrinho carrinho){
        System.out.println("Qual é a forma de pagamento escolhida? ");
        String formaDePagamento = sc.nextLine();
        double valorDaCompra = informaValorIngressos(carrinho) + informaValorProdutos(carrinho);
        System.out.println("O valor da compra é: R$ " + valorDaCompra);
        return valorDaCompra;
    }
}
