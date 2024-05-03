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
        Estoque estoque = new Estoque();
        Carrinho carrinho = new Carrinho(estoque);
        Caixa caixa = new Caixa();
        
        carrinho.selecionarProduto(estoque);
    }
}
