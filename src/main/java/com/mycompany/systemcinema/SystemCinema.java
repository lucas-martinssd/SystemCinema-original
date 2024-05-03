/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemcinema;

import java.time.Duration;

/**
 *
 * @author Lucas
 */
public class SystemCinema {
    
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Caixa caixa = new Caixa();
        
        carrinho.selecionarQuantProduto();
        carrinho.selecionarQuantidadeIngresssos();
        caixa.informaValorIngressos(carrinho);
        caixa.informaValorProdutos(carrinho);
        caixa.realizaPagamento(carrinho);
    }
}
