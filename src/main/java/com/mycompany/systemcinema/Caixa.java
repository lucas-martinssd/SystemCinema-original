/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

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
    
    public double informaValorIngressos(double valorIngressos){
       valorIngressos = carrinho.addQuantidadeIngressos() * 10;
       return valorIngressos;
    }
    /*
    public double informaValorProdutos(double valorProdutos) {
        
    }
*/
}
