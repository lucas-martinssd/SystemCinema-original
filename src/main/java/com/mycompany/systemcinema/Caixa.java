/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Caixa {
    
    private double id;
    private static double valorIngresso = 10;
    private static double pipoca = 5;
    private static double bebidas = 5;
    private static double guloseimas = 5;
    private Carrinho carrinho;
    
    Scanner sc = new Scanner(System.in);
    
    public double informaValorProdutos(Carrinho carrinho){
       double valorProdutos = carrinho.selecionarQuantProduto() * 5;
       System.out.println("O valor dos produtos escolhos é: R$ " + valorProdutos);
       return valorProdutos;
    }
    
    public double informaValorIngressos(Carrinho carrinho){
        double valorIngressos = carrinho.selecionarQuantIngressos() * 10;
        System.out.println("O valor dos ingressos desejados é: R$ " + valorIngressos);
        return valorIngressos;
    }
    
    public String cancelaPagamento(){
        String cancelamento = "Pagamento cancelado";
        System.out.println(cancelamento);
        return cancelamento;
    }
    
    public double realizaPagamento(Carrinho carrinho){
        System.out.println("Qual é a forma de pagamento escolhida? ");
        String formaDePagamento = sc.nextLine();
        double valorDaCompra = informaValorIngressos(carrinho) + informaValorProdutos(carrinho);
        System.out.println("O valor da compra é: R$ " + valorDaCompra);
        return valorDaCompra;
    }
}
